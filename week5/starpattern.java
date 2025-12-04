package week5;


/**
 * Write a description of class starpattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class starpattern
{
   public static void main()
   {
       
       for (int i = 5; i>=1 ; i--)
       {
           for (int j = 1; j<=i; j++)
           {
               System.out.print("*");
            }
            System.out.println();
        }
    }
   
}