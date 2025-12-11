package week6;
import java.util.Scanner;
import java.util.Arrays;


/**
 * Write a description of class simpleNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class simpleNumbers
{
   public static void main()
   {
       int[] number = {10,20,30,40,50};
       float sum = 0;
       float avg = 0;
       Scanner sc = new Scanner (System.in);
       for(int i = 0; i<number.length; i++)
       {
           System.out.println("the intial values(marks) are 10,20,30,40,50");
           System.out.println("enter the marks");
           number[i]= sc.nextInt();
           
           sum += number[i];
       
    }
    
    for (int j = 0; j <number.length; j++)
    {
        System.out.println("the updated marks are: " + number[j]);
    }
    int max = Arrays.stream(number).max().getAsInt();
    int min = Arrays.stream(number).min().getAsInt();
    
    avg = sum/5;
    
    System.out.println("the sum is: " + sum);
    System.out.println("the average is: " + avg);
    System.out.println("the highest score is: " + max);
    System.out.println("the lowest score is: " + min);
}
}