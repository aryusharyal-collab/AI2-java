package week8;


/**
 * Write a description of class companysoftware here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class companysoftware 
{
    public static void main ()
    {
        employee ee = new employee(100 , "ram" , 327653);
        ee.display();
        double finalsalary = ee.getsalary();
        System.out.println("final salary : " + ee.getsalary());
        ee.setName("shyam");
        ee.display();
        int x = ee.getId();
        System.out.println(x);
    }
}