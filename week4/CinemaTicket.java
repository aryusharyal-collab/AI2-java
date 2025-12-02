package week4;
import java.util.Scanner;


/**
 * Write a description of class CinemaTicket here.
 *
 * @author Aryush 
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to XFX Cinema");
        System.out.println("please answer the following questions to get the total ticket price");
        System.out.println("please enter the age group as child, Adult and senior");
        System.out.println("Note age group (1-14)child, (15-40)adult (40+)senior");
        String age = sc.next().toLowerCase();
        System.out.println("Please enter movie language (nepali, hindi, english)");
        String lang = sc.next().toLowerCase();;
        System.out.println("is the customer student? (yes/no)");
        String student = sc.next().toLowerCase();;
        System.out.println("is there any festival (yes/no)");
        String festival = sc.next().toLowerCase();;
        double price = 0;
        switch (age) 
        {
            case "child" ->
            price = 150;
            
            case "adult" ->
            price = 250;
            
            case "senior" ->
            price = 200;
            
              default ->
              System.out.println("Input error");
        }
        
        switch (lang)
        {
            case "nepali" ->
            price += 0;
            
            case "hindi" ->
            price += 50;
            
            case "engllish" ->
            price += 100;
        }
        
        switch (student)
        {
            case "yes" ->
            price *= 0.80; // 100-20=80 so directly multlyplying price with 0.80
        }
        
        
        switch (festival)
        {
            case  "yes" ->
            price *= 0.85;  // 100-15=85 so directly multlyplying price with 0.85
        }
        
        System.out.println("The total price is" + " " + price);
        
        
        
    }
}