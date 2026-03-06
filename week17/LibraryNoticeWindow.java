package week17;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Write a description of class LibraryNoticeWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryNoticeWindow
{
    public static void main ()
    {
        JFrame frame = new JFrame("Library Notice");
        JLabel noticeLabel = new JLabel("Library Opens at 7:00 AM", SwingConstants.CENTER);
        frame.add(noticeLabel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}