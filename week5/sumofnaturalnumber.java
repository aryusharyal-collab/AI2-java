package week5;
import java.util.Scanner;


/**
 * Write a description of class sumofnaturalnumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sumofnaturalnumber
{
     public static void main (String[] args)
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth term of the natural number that you want to sum");
        int j = sc.nextInt();
        for (int i=0; i <= j; i++)
        {
            sum += i;
        }
        
        System.out.println("sum is :" + " " + sum);
        
        
    }
}