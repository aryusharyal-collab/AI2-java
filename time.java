import java.util.Scanner;

/**
 * Write a description of class time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class time
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter time in sec");
        int ts = sc.nextInt();
        int hours = (ts/3600);
        int rt = ts % 3600;
        int min = rt / 60;
        int sec = rt % 60;
        
        System.out.println ("hours:" + " " + hours);
        System.out.println ("minutes:" + " " + min);
        System.out.println ("second:" + " " + sec);
        
        
        
        
        
    }

}