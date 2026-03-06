package week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class CollegeEventAnnouncement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class CollegeEventAnnouncement {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
         
            JFrame frame = new JFrame("College Event Announcement");

            
            JLabel message = new JLabel("Welcome to Orientation Day", SwingConstants.CENTER);
            message.setFont(new Font("SansSerif", Font.BOLD, 20));
            message.setForeground(new Color(10, 40, 80)); 
            frame.add(message, BorderLayout.CENTER);

       
            frame.getContentPane().setBackground(new Color(173, 216, 230)); 

            
            frame.setSize(500, 300);
            frame.setResizable(false);                      
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);               

            
            frame.setVisible(true);
        });
    }
}