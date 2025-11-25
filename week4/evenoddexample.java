package week4;
import java.util.Scanner;


/**
 * Write a description of class evenoddexample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class evenoddexample
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        if (a % 2 == 0 )
        {
            System.out.println("the number :" + " " + a + "is even");
        }
        
        else 
        {
            System.out.println("the number :" + " " + a + " " + "is odd");
           
        }
        
    }
}