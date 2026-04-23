package week10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] args)
    {
        Docter d1 = new Docter(1, "Ram", "Psycholigist", 5000);
        Nurse n1 = new Nurse(1, "Sita", "Night", 5);
        
        System.out.println("Docter's Detail");
        System.out.println(d1);
        System.out.println("with Emergency Cases: " + d1.getSalary(5));
        System.out.println();
        System.out.println("Nurse Detals:");
        System.out.println(n1);
        System.out.println("Salary:" + n1.getSalary());
    }
}