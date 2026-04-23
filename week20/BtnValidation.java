package week20;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BtnValidation extends JFrame {
    private JTextField taskField;
    private JLabel taskLabel;
    private JComboBox<String> priorityBox;
    private JButton addBtn, doneBtn, clearAllBtn;
    private JPanel taskListPanel, topPanel;

    // Store all task rows and checkboxes for filtering
    private ArrayList<JPanel> allTaskRows = new ArrayList<>();
    private ArrayList<JCheckBox> allCheckBoxes = new ArrayList<>();
    private ArrayList<String> allPriorities = new ArrayList<>();

    public void addTask(String task, String priority) {
        JPanel taskRow = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        taskRow.setPreferredSize(new Dimension(450, 30));
        taskRow.setMaximumSize(new Dimension(450, 30));

        JCheckBox checkBox = new JCheckBox(task + " [" + priority + "]");

        JButton deleteBtn = new JButton("Delete");
        deleteBtn.setBackground(Color.RED);
        deleteBtn.setForeground(Color.red);

        deleteBtn.addActionListener(e -> {
            if (checkBox.isSelected()) {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure?",
                        "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    // Remove from lists
                    int index = allTaskRows.indexOf(taskRow);
                    allTaskRows.remove(index);
                    allCheckBoxes.remove(index);
                    allPriorities.remove(index);

                    taskListPanel.remove(taskRow);
                    taskListPanel.revalidate();
                    taskListPanel.repaint();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please check the box to delete this task!");
            }
        });

        taskRow.add(checkBox);
        taskRow.add(deleteBtn);

        // Save to lists
        allTaskRows.add(taskRow);
        allCheckBoxes.add(checkBox);
        allPriorities.add(priority);

        taskListPanel.add(taskRow);
        taskListPanel.revalidate();
        taskListPanel.repaint();
    }

    // Filter method

    private void filterTasks(String filter) {
        taskListPanel.removeAll();

        for (int i = 0; i < allTaskRows.size(); i++) {
            JCheckBox cb = allCheckBoxes.get(i);
            String priority = allPriorities.get(i);
            JPanel row = allTaskRows.get(i);

            boolean show = false;

            switch (filter) {
                case "All Tasks":
                    show = true;
                    break;
                case "Completed":
                    show = cb.isSelected();
                    break;
                case "Pending":
                    show = !cb.isSelected();
                    break;
                case "Important":
                    show = priority.equalsIgnoreCase("High");
                    break;
            }

            if (show) {
                taskListPanel.add(row);
            }
        }

        taskListPanel.revalidate();
        taskListPanel.repaint();
    }


    public BtnValidation() {
        setTitle("My ToDo Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        // ── Top input panel ──
        topPanel = new JPanel(new FlowLayout());
        taskLabel = new JLabel("Task:");
        taskField = new JTextField(15);
        String[] priorities = {"High", "Medium", "Low"};
        priorityBox = new JComboBox<>(priorities);
        // set default to Medium like expected output
        priorityBox.setSelectedItem("Medium");

        addBtn = new JButton("Add Task");
        addBtn.setBackground(Color.GREEN);
        addBtn.setForeground(Color.GREEN); // kept original

        topPanel.add(taskLabel);
        topPanel.add(taskField);
        topPanel.add(priorityBox);
        topPanel.add(addBtn);

        // ── Task list panel ──
        taskListPanel = new JPanel();
        taskListPanel.setLayout(new BoxLayout(taskListPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(taskListPanel);

        // ── Center wrapper
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(topPanel, BorderLayout.NORTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        add(centerPanel, BorderLayout.CENTER);

        // ── Left sidebar (filter buttons) ──
        JPanel sidebarPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        sidebarPanel.setPreferredSize(new Dimension(100, 0));

        JButton allTasksBtn  = new JButton("All Tasks");
        JButton completedBtn = new JButton("Completed");
        JButton pendingBtn   = new JButton("Pending");
        JButton importantBtn = new JButton("Important");

        sidebarPanel.add(allTasksBtn);
        sidebarPanel.add(completedBtn);
        sidebarPanel.add(pendingBtn);
        sidebarPanel.add(importantBtn);
        add(sidebarPanel, BorderLayout.WEST);

        // ── Right panel (Done + Clear All) ──
        doneBtn = new JButton("Done");
        doneBtn.setForeground(Color.RED); // kept original

        clearAllBtn = new JButton("Clear All");
        clearAllBtn.setForeground(Color.ORANGE); // kept original

        JPanel eastPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        eastPanel.add(doneBtn);
        eastPanel.add(clearAllBtn);
        add(eastPanel, BorderLayout.EAST);

        // ── Action Listeners ──

        addBtn.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (task.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter a task!");
            } else {
                String priority = (String) priorityBox.getSelectedItem();
                addTask(task, priority);
                taskField.setText("");
            }
        });

        doneBtn.addActionListener(e -> {
            for (Component comp : taskListPanel.getComponents()) {
                JPanel row = (JPanel) comp;
                JCheckBox cb = (JCheckBox) row.getComponent(0);
                if (cb.isSelected()) {
                    cb.setText("<html><strike>" + cb.getText() + "</strike></html>");
                }
            }
        });

        clearAllBtn.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure?",
                    "Confirm Clear", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                allTaskRows.clear();
                allCheckBoxes.clear();
                allPriorities.clear();
                taskListPanel.removeAll();
                taskListPanel.revalidate();
                taskListPanel.repaint();
            }
        });

        // Filter button listeners
        allTasksBtn.addActionListener(e  -> filterTasks("All Tasks"));
        completedBtn.addActionListener(e -> filterTasks("Completed"));
        pendingBtn.addActionListener(e   -> filterTasks("Pending"));
        importantBtn.addActionListener(e -> filterTasks("Important"));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BtnValidation::new);
    }
}