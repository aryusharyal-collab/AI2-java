package week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class LoginWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class LoginWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login");
        f.setLayout(null);

        JTextField user = new JTextField();
        user.setBounds(50, 50, 200, 30);
        f.add(user);

        JButton btn = new JButton("Login");
        btn.setBounds(150, 150, 100, 40);
        btn.setBackground(Color.GREEN);
        f.add(btn);

        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}