package week4;
import java.util.Scanner;


/**
 * Write a description of class switchcaseExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class switchcaseExample
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("what do you want to do??");
        System.out.println("Addition, Substraction, Division, multiplication");
        System.out.println("enter the operaor as +, -, *, /");
        char operator = sc.next().charAt(0);
       
        
        switch(operator)
        {
            case '+' ->
                System.out.println("addition is " + " " + a+b );
                
                
            case '-' ->
                 System.out.println("substraction is " + " " + a+b );
                 
            case '/' ->
            
                  System.out.println("addition is " + " " + a+b );
                
            
                
            
            
        }
        
    }
}