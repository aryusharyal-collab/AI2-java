package week7;
import java.util.Scanner;

/**
 * Write a description of class employees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employees
{
    int id;
    String name;
    float salary;

    public static void main()
    {
        employees[] emp = new employees[3];
        Scanner sc = new Scanner(System.in);
        int a = 1;

        for (int j = 0; j<emp.length; j++)
        {
            
            emp[j] = new employees();
            System.out.println("for employee " + a);
            System.out.println("enter id,  name and salary");
            emp[j].id = sc.nextInt();
            emp[j].name = sc.next();
            emp[j].salary = sc.nextFloat();
            a++;
            
            
            
            
            

                
        }
        for (int i = 0; i < emp.length; i++)
        {
            emp[i].display();
        }
         
    }
    void display()
    {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}