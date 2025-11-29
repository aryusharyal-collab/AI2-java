package week4;
import java.util.Scanner;

/**
 * Write a description of class gpa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gpa
{
    public static void main(String[] args)
    
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 to 4.0): ");

        if (!scanner.hasNextDouble()) 
        {
            System.out.println("Error: Invalid input. Please enter a number.");

        }

        double gpa = scanner.nextDouble();

        if (gpa < 0.0 || gpa > 4.0) 
        {
            System.out.println("Error: GPA must be between 0.0 and 4.0.");
            return;
        }

        String grade = "";

        if (gpa >= 3.7)
        {
            grade = "A";
        } 
        
        else if (gpa >= 3.0) 
        {
            grade = "B";
        } 
        
        else if (gpa >= 2.0) 
        {
            grade = "C";
        } 
        
        else if (gpa >= 1.0) 
        {
            grade = "D";
        } 
        
        else if (gpa < 0.0 || gpa > 4.0)
        {
            System.out.println("range error");
        }
        
        else
        
        {
            grade = "F";
        }

        System.out.println("Your grade is: " + grade);
    }
}