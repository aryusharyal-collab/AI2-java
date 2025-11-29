package week4;
import java.util.Scanner;


/**
 * Write a description of class papersize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class papersize
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter size of paper (A0 to A5)");
        String a = sc.next();
        String size = a.toLowerCase();
        switch (size)
        
        {
            case "a0" ->
            System.out.println("841 x 1189 mm (33.1 x 46.8 inches)");
            
            case "a1" ->
            System.out.println("594 x 841 mm (23.4 x 33.1 inches)");
            
            case "a2" ->
            System.out.println("420 x 594 mm (16.5 x 23.4 inches)");
            
            case "a3" ->
            System.out.println("297 x 420 mm (11.7 x 16.5 inches)");
            
            case "a4" ->
            System.out.println(" 210 x 297 mm (8.3 x 11.7 inches");
            
            case "a5" ->
            System.out.println("148 x 210 mm (5.8 x 8.3 inches");
            
            default ->
            
            System.out.println("Input error");
            
            
            
            
            
            
        }
        
        
    }
    
}