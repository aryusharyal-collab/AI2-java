package week4;
import java.util.Scanner;


/**
 * Write a description of class result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class result
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int a = sc.nextInt();
        if (a>=95 && a<=100)
        {
            System.out.println("distinction");
        }
        
        else if (a>=80 && a<= 94)
        {
            System.out.println("first division");
        }
        
        else if (a>=70 && a<=79)
        {
            System.out.println("second division");
        }
        
        else if (a>=50 && a<=69)
        {
            System.out.println("third division");
        }
        
        else if (a<50)
        {
            System.out.println("fail");
        }
        
        else 
        {
            System.out.println("input error");
        }
        
            
        
        
        
        
        
        
    }   
    
}