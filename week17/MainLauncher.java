package week17;
import javax.swing.*;

/**
 * Write a description of class MainLauncher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class MainLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> 
        {
            Student s1 = new Student("001", "Shishir", "Programming");
            Student s2 = new Student("002", "Aryush", "Computing");

            new IDCardWindow(s1);
            new IDCardWindow(s2);
        });
        
    }
}