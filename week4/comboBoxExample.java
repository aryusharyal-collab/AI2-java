package week4;
import javax.swing.JComboBox;


/**
 * Write a description of class comboBoxExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class comboBoxExample
{
    public static void main (String[]args)
    {
        String[] agegroup = {"child", "adult", "senior"};
        String[] type = {"a", "b", "c", "d"};
        JComboBox<String> agecombo = new JComboBox(agegroup);
        
    }
    
}