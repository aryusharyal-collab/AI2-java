package week6;
import java.util.Scanner;


/**
 * Write a description of class UserInputArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputArray
{
   public static void main ()
   {
    Scanner sc = new Scanner  (System.in);
    System.out.println("enter the size of array");
    int size  = sc.nextInt();
    String[]name = new String[size];
    for (int i = 0; i < name.length; i++)
    {
        System.out.println("enter the name");
        name[i] = sc.next();
    }
    
    System.out.println("displaying the names");
    for (int j = 0; j < name.length; j++)
    {
        System.out.println("the name is : " + name[j]);
    }
    
   }
}