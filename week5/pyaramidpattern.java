package week5;


/**
 * Write a description of class pyaramidpattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pyaramidpattern
{
    public static void main()
    {
        int i = 0;
        int n =5;
        
       for (i = 1; i<=n; i++)
       {
           for (int j = n; j>i; j--)
           {
               System.out.print(" ");
            }
        
            
            for (int k = 1; k <=(2 * i - 1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
