import java.util.Scanner;

/**
 * Write a description of class subject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class subject
{
    public static void main (String[]args)
    {
        float a, b, c, d, e, f;
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter marks of 5 subjects");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        float sum = a+b+c+d+e+f;
        float p = ((sum/500)*100);
        float avg = sum/5;
        System.out.println ("percentage =" + " " + p);
        System.out.println ("Average =" + " " + avg);
        
        
    }
}