package week4;
import java.util.Scanner;


/**
 * Write a description of class either3or5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class either3or5
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if (a % 3 == 0 && a % 5 == 0)
        {
            System.out.println("Divisible by both 3 and 5");
        }
        
        else if (a % 3 == 0 && a % 5 != 0)
        {
            System.out.println("Divisible by 3 but not by 5");
        }
        
        else if (a % 3 !=  0 && a % 5 == 0)
        {
           System.out.println("Divisible by 5 but not by 3"); 
        }
        
        else
        {
            System.out.println("Not divisible by both 3 and 5");
        }
    }
}