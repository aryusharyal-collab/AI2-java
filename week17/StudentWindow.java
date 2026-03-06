package week17;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Write a description of class StudentWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class StudentWindow extends JFrame {

    public StudentWindow() {
        setTitle("Student Profile");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentWindow win = new StudentWindow();
            win.setVisible(true);
        });
    }
}