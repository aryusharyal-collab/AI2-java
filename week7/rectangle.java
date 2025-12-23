package week7;
import java.util.Scanner;


/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle
{
    float length;
    float breadth;
    
    public static void main()
    {
         Scanner sc = new Scanner(System.in);
         
         rectangle rectangle1 = new rectangle();
         System.out.println("enter length of rectangle 1 ");
         rectangle1.length = sc.nextFloat();
         System.out.println("enter breadth of rectangle 1 ");
         rectangle1.breadth = sc.nextFloat();
         
         rectangle rectangle2 = new rectangle();
         System.out.println("enter length of rectangle 2 ");
         rectangle2.length = sc.nextFloat();
         System.out.println("enter breadth of rectangle 2 ");
         rectangle2.breadth = sc.nextFloat();
         
         rectangle1.calc();
         rectangle2.calc();
        
    }
    
    void calc()
    {
        System.out.println("length is: " + length);
        System.out.println("breadth is: " + breadth);
        System.out.println("Area is: " + length * breadth);
        System.out.println();



    }
}