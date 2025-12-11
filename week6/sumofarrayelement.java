package week6;


/**
 * Write a description of class sumofarrayelement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sumofarrayelement
{
    public static void main()
    {
        int[]arr = {10,20,44,55,22}; //declaration, construction and inistiallization of array in same line
        int sum = 0;
        for (int i = 0; i<arr.length; i++)
        {
            sum += arr[i];
     
        }
        
        System.out.println("sum of the numbers is: " + sum);
    }
    
}