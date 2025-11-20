import java.util.Scanner;

/**
 * Write a description of class variables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class variables
{
    public static void main (String[]arg)
    {
       Scanner obj = new Scanner(System.in);
       System.out.println("enter your age");
       int age = obj.nextInt();
       if (age>18)
       {
           System.out.println("voter");
       }
       
       else 
       {
           System.out.println("non-voter");
       }
       
       
       
    }
}
