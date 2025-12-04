package week5;


/**
 * Write a description of class sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sum
{
    public static void main()
{
    int sum = 0;
    
        for(int i = 0; i<=10; i++)
        {
            sum += i*i;
        }
    
        System.out.println("total sum is" + " " + sum);
}
}