import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main (String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mark");
        int m = sc.nextInt();
        if (m>=40)
        {
            System.out.println("pass");
        }
        
        else 
        {
            System.out.println("fail");
        }
        
    }
}