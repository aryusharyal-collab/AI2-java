package week8;


/**
 * Write a description of class HospitalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalTest
 {
    public static void main(String[] args)
    {
        Patient p1 = new Patient("Aryush Aryal", 22, 5, 2500.0);
        Patient p2 = new Patient("Sam Khatri", 30, 10, 3000.0);

        p1.displayDetails();
        System.out.println("Total Bill: " + p1.calculateTotalBill());
        System.out.println();

        p2.displayDetails();
        System.out.println("Total Bill: " + p2.calculateTotalBill());
    }
}