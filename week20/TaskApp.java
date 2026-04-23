package week20;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskApp extends JFrame
{
    private JTextField taskField;
    private JButton addBtn;
    private JPanel taskListPanel;
    private JScrollPane scrollPane;
    private JComboBox<String> priorityBox;

    public TaskApp () 
    {
        setTitle("Task Manager");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Priority Box
        String priorities[] = {"Low", "Medium", "High"};
        priorityBox = new JComboBox<>(priorities);

        // Top Panel
        JPanel topPanel = new JPanel(new FlowLayout());

        taskField = new JTextField(15);
        addBtn = new JButton("Add Task");

        topPanel.add(taskField);
        topPanel.add(addBtn);
        topPanel.add(priorityBox);

        add(topPanel, BorderLayout.NORTH);

        // Task List Panel
        taskListPanel = new JPanel();
        taskListPanel.setLayout(new BoxLayout(taskListPanel, BoxLayout.Y_AXIS));

        scrollPane = new JScrollPane(taskListPanel);
        add(scrollPane, BorderLayout.CENTER);

        // Button Logic
        addBtn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String taskText = taskField.getText().trim();
                String priority = (String) priorityBox.getSelectedItem();

                if (taskText.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Enter a task!");
                    return;
                }

                addTask(taskText, priority);
                taskField.setText("");
            }
        });

        setVisible(true);
    }

    // ADD TASK METHOD
    public void addTask(String taskText, String priority) 
    {
        JPanel taskPanel = new JPanel(new BorderLayout());
        taskPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));

        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5, 0));

        JCheckBox checkBox = new JCheckBox();
        JLabel taskLabel = new JLabel(taskText + " [" + priority + "]");
        JButton deleteBtn = new JButton("Delete");

        // Optional: Color based on priority
        if(priority.equals("High"))
            taskLabel.setForeground(Color.RED);
        else if(priority.equals("Medium"))
            taskLabel.setForeground(Color.ORANGE);
        else
            taskLabel.setForeground(Color.GREEN);

        leftPanel.add(checkBox);
        leftPanel.add(taskLabel);
        rightPanel.add(deleteBtn);

        taskPanel.add(leftPanel, BorderLayout.WEST);
        taskPanel.add(rightPanel, BorderLayout.EAST);

        // Delete with confirmation
        deleteBtn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to delete this task?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION)
                {
                    taskListPanel.remove(taskPanel);
                    taskListPanel.revalidate();
                    taskListPanel.repaint();
                }
            }
        });

        taskListPanel.add(taskPanel);
        taskListPanel.revalidate();
        taskListPanel.repaint();
    }

    public static void main(String[] args) 
    {
        new TaskApp();
    }
}