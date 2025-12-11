package week6;
import java.util.Scanner;


/**
 * Write a description of class matrixexample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class matrixexample
{
    public static void main()
    {
    Scanner sc = new Scanner(System.in);
    int[][]matrix = new int[2][2];
    System.out.println("inilization of matrix");
    for (int i = 0; i<2;i++)
    {
        for (int j = 0; j<2; j++)
        
        {
            System.out.println("enter the data");
            matrix[i][j]=sc.nextInt();
            
            
        }
    }
    
    for(int a = 0; a<2;a++)
    {
        for(int b = 0; b<2; b++)
        {
            
            System.out.print(matrix[a][b]+"\t");
        }
        System.out.println();
    }
    }
}