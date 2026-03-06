package week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class IDCardPreview here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class IDCardPreview {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("ID Card Preview");

            String text = "<html><h2>ID Card Preview</h2>"
                    + "Name: Shishir Mishra<br>"
                    + "Module: Programming<br>"
                    + "College: Islington College</html>";

            JLabel label = new JLabel(text, SwingConstants.CENTER);
            label.setFont(new Font("SansSerif", Font.PLAIN, 18));

            f.add(label);
            f.setSize(400, 300);
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        });
    }
}
