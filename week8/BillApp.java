package week8;


/**
 * Write a description of class BillApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BillApp
 {
    public static void main(String[] args)
    {
        ElectricityBill bill = new ElectricityBill("Aryush Aryal", 145);
        System.out.println("Consumer: " + bill.getConsumerName());
        System.out.println("Units: " + bill.getUnitsConsumed());
        System.out.println("Amount: ₹" + bill.calculateBill());
    }
}