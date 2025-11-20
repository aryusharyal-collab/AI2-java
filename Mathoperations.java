import java.util.Scanner;

/**
 * Write a description of class Mathoperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mathoperations
{
    public static void main (String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st num");
        int first = sc.nextInt();
        System.out.println("enter 2st num");
        int second = sc.nextInt();
        String a = (first>second)? "greater no is" + " " + first : "greater no is" + " " + second;
        System.out.println(a);
        
        
        
        
        
    }
}