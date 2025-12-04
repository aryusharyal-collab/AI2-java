package week5;
import java.util.Scanner;


/**
 * Write a description of class Primeornot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Primeornot
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        boolean prime = true;
        
        if (n <=1 )
        {
        prime = false;
    }
        
         else
         { 
             
         for (int i = 2 ; i<=(n/2) ; i++)
         {
            if (n % i == 0)
            {
            prime = false;
            break;
        }
        }
    }
        if (prime == true)
        System.out.println("it is prime number");
        
        else 
        System.out.println("it is not a prime number");
        
       
        
        
    

}
}
