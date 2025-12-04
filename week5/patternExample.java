package week5;


/**
 * Write a description of class patternExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class patternExample
{
    public static void main()
    {
        for (int i = 1; i<4 ; i++)
        {
            for (int j = 1; j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}