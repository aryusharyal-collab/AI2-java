package week5;


/**
 * Write a description of class fibonacii here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fibonacii
{
    public static void main ()
    {
        int a = 0;
        int b= 1;
        System.out.print("fibonacii series is:");
        for (int i = 1; i<11; i++)
        {
            System.out.print(a + " ");
            int next = a+b;
            a=b;
            b= next;
        }
        
    }
        
}