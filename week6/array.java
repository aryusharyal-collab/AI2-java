package week6;


/**
 * Write a description of class array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array
{
    public static void main ()
    {
        int[] age; // array decleration
        int[]number=new int[5];
        age = new int[5]; // construction and size decleration of array
        age[0]= 10;   
        age[1]= 20;        
        age[2]= 30;      
        age[3]= 40;
        age[4]= 50;
        int x = 2;
        
        for (int i = 0 ; i<5; i++) //using loop 
        {
            System.out.println(age[i]);
        }
      for (int j = 0 ; j<5; j++)
            {
            number[j] = x;
            x += 2;
            System.out.println(number[j]);
            
            
        
        
            }
}
}