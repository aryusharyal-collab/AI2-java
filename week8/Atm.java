package week8;


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atm
{
    public static void main ()
    {
        bankAccount acc1 = new bankAccount (872945L, 50000F, "Aryush Aryal" );
        System.out.println("Account : " + acc1.getAccountNumber() + "\n" + "Balance: " + acc1.getBalance() + "\n"  );
        System.out.println("initial balance: " + acc1.getBalance());
        
        // Test deposit       
        acc1.deposit(500.0);    
        System.out.println("Balance after deposit: " + acc1.getBalance());
        
        // Test withdraw (successful)    
        boolean success1 = acc1.withdraw(300.0);     
        System.out.println("Withdrawal 300 successful? " + success1);   
        System.out.println("Balance after withdrawal: " + acc1.getBalance());
        
        // Test withdraw (failed due to insufficient funds) 
        boolean success2 = acc1.withdraw(1500.0);    
        System.out.println("Withdrawal 1500 successful? " + success2);     
        System.out.println("Final Balance: " + acc1.getBalance());
        
    }
    
}