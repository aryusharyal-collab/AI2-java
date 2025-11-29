package week4;
import java.util.Scanner;


/**
 * Write a description of class scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scholarship
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter attendance, gpa and attitude score (1-10) in given order");
        float attendance = sc.nextFloat();
        float gpa = sc.nextFloat();
        float as = sc.nextFloat();
        
        if (attendance > 80.0  && gpa >= 3.6 && as < 5.0)
        {
            System.out.println("conguralations!! you are eligible for scholarship");
        }
        
        else 
        {
          System.out.println("sorry, you are not eligible for scholarship ");  
        }
    
    }
}