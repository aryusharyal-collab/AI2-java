package week17;
import javax.swing.*;
import javax.swing.*;

/**
 * Write a description of class IDCardWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */




public class IDCardWindow extends JFrame {
    public IDCardWindow(Student s) {
        JLabel label = new JLabel(s.getHTML(), SwingConstants.CENTER);
        add(label);
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}