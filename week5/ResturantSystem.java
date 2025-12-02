package week5;
import java.util.Scanner;

/**
 * Write a description of class ResturantSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResturantSystem
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        int quantity;
        int totalbill=0;
        do
        {
            System.out.println("1: Burger RS 200");
            System.out.println("2: MOMO RS 100");
            System.out.println("3: Piza RS 300");
            System.out.println("0: bill");
            System.out.println("please enter the number");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1 ->
                    {
                        System.out.println("you have chosen burger");
                        System.out.println("enter quantity");
                        quantity = sc.nextInt();
                        totalbill += 200*quantity;
                    }
                case 2 -> 
                    {
                        System.out.println("you have choosen momo");
                        System.out.println("enter quantity");
                        quantity = sc.nextInt();
                        totalbill += 100*quantity;

                    }
                    
                case 3 ->
                {
                    System.out.println("you have choosen pizza");
                    System.out.println("enter quantity");
                    quantity = sc.nextInt();
                    totalbill += 300*quantity;
                }
                
                case 0 ->
                {
                    System.out.println("total bill :" + totalbill);
                }
                
                default ->
                {
                    System.out.println("input error!! please note the numbers carefully and try again");
                }
            }
        }while(choice != 0);
    }
}   