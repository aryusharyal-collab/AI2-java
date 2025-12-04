package week5;


/**
 * Write a description of class lcm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lcm
{
    public static void main()
    {
        for(int i = 1; i<101; i++)
        {
            if(i % 7==0 && i % 9 == 0)
            {
                System.out.println("lcm of 7 and 9 is"+ " " + i);
                break;
            }
            
        }
    }
}