package week6;
import java.util.Scanner;


/**
 * Write a description of class array1d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array1d
{
   public static void main()
   {
       int age[]= new int[5]; //decleration of 1d array
       int matrix[][]=new int[2][2];  // decelaration of 2d array
       String name[] = new String[5];
       Scanner sc = new Scanner(System.in);
       for(int i = 0; i<name.length;i++)
       {
           System.out.println("enter the name of students");
           name[i] = sc.next();
           System.out.println("name of students is: " + name[i]);
           System.out.println();
           
        }
       
       
       
    }
}