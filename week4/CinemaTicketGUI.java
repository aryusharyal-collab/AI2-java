package week4;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Write a description of class CinemaTicketGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class CinemaTicketGUI extends JFrame
 {

    public CinemaTicketGUI()
    {

        setTitle("XFX Cinema Ticket Calculator 🎟️");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  
        setLayout(new GridLayout(6, 1, 10, 10));

        
        String[] ageGroups = {"Child (Rs. 150)", "Adult (Rs. 250)", "Senior (Rs. 200)"};
        JComboBox<String> ageCombo = new JComboBox<>(ageGroups);

        
        String[] languages = {"Nepali (+0)", "Hindi (+50)", "English (+100)"};
        JComboBox<String> langCombo = new JComboBox<>(languages);

        
        JCheckBox studentCheck = new JCheckBox("I am a Student (20% off)");
        JCheckBox festivalCheck = new JCheckBox("Festival Day (15% off)");

        // --- BUTTON ---
        JButton calcBtn = new JButton("Calculate Ticket Price");

        // --- PANEL TO DISPLAY RESULT ---
        JLabel resultLabel = new JLabel("Final Price: Rs. 0.00", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Add components to frame
        add(new JLabel("Select Age Group:", SwingConstants.CENTER));
        add(ageCombo);
        add(new JLabel("Select Movie Language:", SwingConstants.CENTER));
        add(langCombo);
        add(studentCheck);
        add(festivalCheck);
        add(calcBtn);
        add(resultLabel);

        // --- BUTTON EVENT HANDLER ---
        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double price = 0;

                // Base price
                switch (ageCombo.getSelectedIndex()) {
                    case 0: price = 150; break; // Child
                    case 1: price = 250; break; // Adult
                    case 2: price = 200; break; // Senior
                }

                // Language surcharge
                switch (langCombo.getSelectedIndex()) {
                    case 1: price += 50; break;  // Hindi
                    case 2: price += 100; break; // English
                }

                // Student discount
                if (studentCheck.isSelected()) {
                    price *= 0.80;
                }

                // Festival discount
                if (festivalCheck.isSelected()) {
                    price *= 0.85;
                }

                // Show result
                resultLabel.setText("Final Price: Rs. " + String.format("%.2f", price));

                JOptionPane.showMessageDialog(
                        null,
                        "Your final ticket price is: Rs. " + String.format("%.2f", price),
                        "Ticket Price",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CinemaTicketGUI();
    }
}