package week4;
import java.util.Scanner;

/**
 * Write a description of class passorfail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class passorfail
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your percantage");
        int a = sc.nextInt();
        if (a > 40)
        {
            System.out.println("pass");
        }

        else { System.out.println("fail"); }
    }
}