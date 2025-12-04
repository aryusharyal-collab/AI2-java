package week5;
import java.util.Scanner;


/**
 * Write a description of class EvenOddCOunt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOddCOunt
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        while(num > 0)
        {
            int digit = num % 10;
            if (digit % 2 == 0)
            even++;
            
            else
            odd++;
            
            num /= 10;
        }
        
        System.out.println("even digit:" + " " + even);
        System.out.println("odd digit:" + " " + odd);
        
    }
}