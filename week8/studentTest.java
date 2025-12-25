package week8;

/**
 * Write a description of class studentTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class studentTest
{
    public static void main ()
    {

        student s1 = new student(101, "Aryush Aryal", "Kathmandu", 9812345678L, "Islington College");     
        s1.displayInfo();
        
        student s2 = new student (102, "saksham shrestha", "kathmandu", 986556444, "itahari international college");
        s2.displayInfo();
        
    }
}