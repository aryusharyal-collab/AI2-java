package week6;


/**
 * Write a description of class skillMark2d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class skillMark2d
{
   public static void main()
   {
       int total1 = 0;
       int total2 = 0;
       int[][] mark =
       {
           {23,33}, {44,56} //marks of student 1 and 2 of english and nepali
        };
        
        for(int i = 0; i<2; i++)
        {
            for (int j = 0; j<2;j++)
            {
                System.out.print(mark[i][j] + " ");
            }
            System.out.println();
        }
       
       for (int a = 0; a<1; a++)
       {
           for(int b = 0; b<2; b++)
           {
               total1 += mark[a][b];
            }
        }
        
        
       for (int a = 1; a>0; a--)
       {
           for(int b = 0; b<2; b++)
           {
               total2 += mark[a][b];
            }
        }
       System.out.println("total of student 1 = " + total1);
       System.out.println("total of student 2 = " + total2);
    }
}