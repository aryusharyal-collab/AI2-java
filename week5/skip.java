package week5;


/**
 * Write a description of class skip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class skip
{
    public static void main()
    {
        for (int i = 1; i<=100; i++)
        {
            if (i % 13 == 0)
            {
                System.out.println("stopped at " + " " + i);
                break;
            }
            
            if(i % 2 == 0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}