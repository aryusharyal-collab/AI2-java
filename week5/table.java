package week5;


/**
 * Write a description of class table here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class table
{
    public static void main()
    {
      for (int i = 1; i < 11; i++)
      {
          for (int j = 1; j <11 ; j++)
          {
              System.out.print(i + " " + "X" + " " + j + " " + "=" + i*j);
              System.out.println();
              
            }
        }
    }
}