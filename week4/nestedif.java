package week4;
import java.util.Scanner;

/**
 * Write a description of class nestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nestedif
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        if (a % 5 == 0)
        {
            if (a % 3 == 0)
            {
                System.out.println("divisible by 3 and 5");
            }
            
            else 
            {
                System.out.println("divisible by 5 but not by 3");
            }
        }
        
        else 
        {
            if( a % 3 == 0)
            {
                System.out.println("divisible by 3 but not by 5");
                
            }
            
            else {
            
                System.out.println(" not divisible by 5 and 3");
            }
        }

    
    }
}