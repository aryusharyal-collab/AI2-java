package week22;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PatientManagementSystem extends JFrame  {

    // GUI Components
    private JTextField txtName, txtAge;
    private JComboBox<String> comboGender, comboDisease;
    private JButton btnSubmit, btnClear;
    private JPanel formPanel;
    private JTextArea displayArea;

    // List to store patient records

    public PatientManagementSystem() {
        setTitle("Patient Management System");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Form Panel
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Name
        formPanel.add(new JLabel("Patient Name:"));
        txtName = new JTextField();
        formPanel.add(txtName);

        // Age
        formPanel.add(new JLabel("Age:"));
        txtAge = new JTextField();
        formPanel.add(txtAge);

        // Gender
        formPanel.add(new JLabel("Gender:"));
        String[] genders = {"Select Gender", "Male", "Female", "Other"};
        comboGender = new JComboBox<>(genders);
        formPanel.add(comboGender);

        // Disease
        formPanel.add(new JLabel("Disease:"));
        String[] diseases = {"Select Disease", "Flu", "Covid", "Diabetes", "Cancer"};
        comboDisease = new JComboBox<>(diseases);
        formPanel.add(comboDisease);

        // Buttons
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener((e) -> 
                {
                    try
                    {
                        submitData();
                    }
                    catch(NumberFormatException en)
                    {
                        JOptionPane.showMessageDialog(this,en.getMessage(),"Error Message", JOptionPane.ERROR_MESSAGE);
                    }
                    catch(IllegalArgumentException ex)
                    {
                        JOptionPane.showMessageDialog(this,ex.getMessage(),"Error Message", JOptionPane.ERROR_MESSAGE);
                    }
            });

        btnClear = new JButton("Clear");

        formPanel.add(btnSubmit);
        formPanel.add(btnClear);

        add(formPanel, BorderLayout.NORTH);

        // Display Panel
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(displayArea);
        scroll.setBorder(BorderFactory.createTitledBorder("Patient Records"));
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> { new PatientManagementSystem();});
    }

    public void submitData()
    {
        String name = txtName.getText().trim();
        if(name.isBlank())
        {
            throw new IllegalArgumentException("Name field can't be empty");
        }
        
        String ageFromGui = txtAge.getText();
        char[]ageArr = ageFromGui.toCharArray();
        
        for (char ch:ageArr)
        {
            if(!Character.isDigit(ch))
            {
                throw new NumberFormatException("Age field can't contain alphabet");
            }
            
        }
    }


}  