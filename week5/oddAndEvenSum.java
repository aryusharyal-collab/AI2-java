package week5;


/**
 * Write a description of class oddAndEvenSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class oddAndEvenSum
{
    public static void main()
    {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<10; i++)
        {
            if(i % 2 == 0)
            {
                sum2 += i;
                
            }
            
            
            else 
            {
                sum1 += i;
                
            }
            
    }
    System.out.println("sum of even number is:" + " " +sum2 );
            System.out.println("sum of odd number is:" + " " + sum1);
}
}