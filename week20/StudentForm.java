package week20;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class StudentForm extends JFrame implements ActionListener {

    private String[] btnList = {"Add", "Edit", "Delete", "View"};
    private JTextField txtField;
    private JComboBox<String> courseBox;
    private ButtonGroup genderGrp;
    private JCheckBox readBox, travelBox, sportsBox;
    private JTextArea displayArea;

    private JButton submitBtn, clearFormBtn, clearDisplayBtn;
    private ArrayList<Student> list = new ArrayList<>();
    

    public StudentForm() {

        setTitle("Student Registration");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ---------------- TITLE ----------------
        JPanel titlePanel = new JPanel();
        JLabel label = new JLabel("Student Registration Details");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.RED);
        titlePanel.add(label);
        add(titlePanel, BorderLayout.NORTH);

        // ---------------- SIDEBAR ----------------
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        sidebarPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        sidebarPanel.add(Box.createVerticalGlue());

        for (String btn : btnList) {
            JButton button = new JButton(btn);
            button.setMaximumSize(new Dimension(120, 35));
            sidebarPanel.add(button);
            sidebarPanel.add(Box.createVerticalStrut(10));
        }

        sidebarPanel.add(Box.createVerticalGlue());
        add(sidebarPanel, BorderLayout.WEST);

        // ---------------- FORM PANEL ----------------
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // ---- Name ----
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        txtField = new JTextField(15);
        formPanel.add(txtField, gbc);

        // ---- Course ----
        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(new JLabel("Course:"), gbc);

        gbc.gridx = 1;
        String[] courses = {"Computing", "AI", "Multimedia", "Networking"};
        courseBox = new JComboBox<>(courses);
        formPanel.add(courseBox, gbc);

        // ---- Gender ----
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(new JLabel("Gender:"), gbc);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton others = new JRadioButton("Others");

        // Set action commands
        male.setActionCommand("Male");
        female.setActionCommand("Female");
        others.setActionCommand("Others");

        genderGrp = new ButtonGroup();
        genderGrp.add(male);
        genderGrp.add(female);
        genderGrp.add(others);

        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(others);

        gbc.gridx = 1;
        formPanel.add(genderPanel, gbc);

        // ---- Hobbies ----
        gbc.gridx = 0; gbc.gridy = 3;
        formPanel.add(new JLabel("Hobbies:"), gbc);

        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        readBox = new JCheckBox("Reading");
        travelBox = new JCheckBox("Travelling");
        sportsBox = new JCheckBox("Sports");

        hobbyPanel.add(readBox);
        hobbyPanel.add(travelBox);
        hobbyPanel.add(sportsBox);

        gbc.gridx = 1;
        formPanel.add(hobbyPanel, gbc);

        // ---- Buttons ----
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));

        submitBtn = new JButton("Submit");
        submitBtn.setForeground(Color.RED);
        submitBtn.setBackground(new Color(255, 200, 0));
        submitBtn.addActionListener(this);

        clearFormBtn = new JButton("Clear Form");
        clearFormBtn.setForeground(Color.RED);
        clearFormBtn.setBackground(Color.RED);
        clearFormBtn.addActionListener(this);

        clearDisplayBtn = new JButton("Clear Display");
        clearDisplayBtn.setForeground(Color.BLACK);
        clearDisplayBtn.setBackground(Color.GREEN);
        clearDisplayBtn.addActionListener(this);

        buttonPanel.add(submitBtn);
        buttonPanel.add(clearFormBtn);
        buttonPanel.add(clearDisplayBtn);

        gbc.gridx = 1; gbc.gridy = 4;
        formPanel.add(buttonPanel, gbc);

        add(formPanel, BorderLayout.CENTER);

        // DISPLAY AREA
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("Student Details"));

        displayArea = new JTextArea(6, 50);
        displayArea.setEditable(false);
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(displayArea);
        resultPanel.add(scrollPane, BorderLayout.CENTER);

        add(resultPanel, BorderLayout.SOUTH);
    }

    // FIXED METHOD NAME
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitBtn) {
            submitForm();
        }

        if (e.getSource() == clearFormBtn) {
            txtField.setText("");
            courseBox.setSelectedIndex(0);
            genderGrp.clearSelection();
            readBox.setSelected(false);
            travelBox.setSelected(false);
            sportsBox.setSelected(false);
        }

        if (e.getSource() == clearDisplayBtn) {
            displayArea.setText("");
        }
    }

    public void submitForm() {

        String name = txtField.getText();
        String course = (String) courseBox.getSelectedItem();

        String gender = "";
        if (genderGrp.getSelection() != null) {
            gender = genderGrp.getSelection().getActionCommand();
        }

        ArrayList<String> hobbiesList = new ArrayList<>();

        if (readBox.isSelected()) hobbiesList.add("Reading");
        if (travelBox.isSelected()) hobbiesList.add("Travelling");
        if (sportsBox.isSelected()) hobbiesList.add("Sports");

        String hobbies = String.join(", ", hobbiesList);
        
        Student student = new Student (name,course,gender,hobbiesList);
        list.add(student);
        
        

        displayArea.append(
            "Name: " + name +
            "\nCourse: " + course +
            "\nGender: " + gender +
            "\nHobbies: " + hobbies +
            "\n------------------------\n"
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
                    new StudentForm().setVisible(true);
            });
    }
}
