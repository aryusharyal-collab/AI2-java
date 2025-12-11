package week6;
import java.util.Scanner;


/**
 * Write a description of class districts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class districts
{
    public static void main()
    {
        String[] dis = {"Morang", "Kathmandu","kaski","sindhuli"};
        Scanner sc = new Scanner(System.in);
        System.out.println("the initial entries are");
        int x = 1;
        String choice;
        int w = 1;
        int l = 1;
        for(int i = 0; i<dis.length;i++)
        {
            System.out.println(x + " " + dis[i]);
            x ++;
            
        }
        
        System.out.println("do you want to change the entries?? (Yes/No)");
        choice = sc.next().toUpperCase();
        if (choice.equals("YES"))
        {
            for(int j = 0; j<dis.length;j++)
            {
                System.out.println("enter the name of districts");
                dis[j] = sc.next();
                
           
            }
            
             System.out.println("the updated entries are:");
        for(int r = 0; r<dis.length;r++)
        {
           System.out.println(l + dis[r]);
           l++;
           
        }
        }
        else if (choice.equals("NO"))
        {
            System.out.println("the name of districts are:");
            for (int a = 0; a<dis.length; a++)
            {
                System.out.println(w + dis[a]);
                w++;
                
            }
        }
        
        else 
        {
        System.out.println("input error");
    }
        
        
        
        
    }
}