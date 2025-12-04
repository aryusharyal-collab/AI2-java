package week5;
import java.util.Scanner;


/**
 * Write a description of class reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reverse
{
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter any integer");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;
        while (num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10 ;
        }
        System.out.println("reversed number is " + " " + reversed);
        
        if (reversed == original)
        {
            System.out.println("the reversed number and original number are same");
        }
        
        else
        
        {
            System.out.println("the reversed number and original number aren't same");
        }
        }
        
    }
