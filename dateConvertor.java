import java.util.Scanner;

/**
 * Write a description of class dateConvertor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dateConvertor
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter days");
        int td = sc.nextInt();
        int years = td/365;
        int rd = td % 365 ; 
        int months = rd/ 30;
        int days = rd % 30;
        
        System.out.println ("Years:" + " " + years);
        System.out.println ("Months:" + " " + months);
        System.out.println("days:" + " " + days);
        
    }
}