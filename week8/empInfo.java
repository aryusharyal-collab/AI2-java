package week8;


/**
 * Write a description of class empInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class empInfo
{
   public static void main ()
   {
       emp e1 = new emp (30000);
       double gross1 = e1.calculateGrossSalary();
        System.out.println("Basic Salary of employee 1: " + e1.getBasicSalary() + "\n");
        System.out.println("Gross Salary of employee 1: " + gross1);
        System.out.println();
       emp e2 = new emp (100000);
       double gross2 = e2.calculateGrossSalary();
        System.out.println("Basic Salary of employee 2: " + e1.getBasicSalary() + "\n");
        System.out.println("Gross Salary of employee 2: " + gross2);
       
    }
}