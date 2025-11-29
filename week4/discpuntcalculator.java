package week4;
import java.util.Scanner;


/**
 * Write a description of class discpuntcalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class discpuntcalculator
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marked priced");
        float mp = sc.nextFloat();
        System.out.println("enter the category opf discount");
        char dis = sc.next().charAt(0);
        char toLower=Character.toLowerCase(dis);
        float discount=0;
        switch (toLower)
        {
            case  'a' ->
            discount = 60;
            
            case 'b' ->
            discount = 40;
            
            case 'c' ->
            discount = 20;
            
            case 'd' ->
            discount = 10;
            
            
        }
        
        float sp = mp - (mp * (discount/100));
        System.out.println("total price =" + " " + sp);

        
        
        
    }
   
}