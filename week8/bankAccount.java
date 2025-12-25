package week8;

/**
 * Write a description of class bankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankAccount
{
    private double accountNumber;
    private float balance;
    private String name;

    public bankAccount (double accountNumber,float balance,String name)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {   
        if (amount > 0) 
        {        
            balance += amount;    
            System.out.println("Deposited: " + amount);      
        } 
        else 
        {          
            System.out.println("Deposit amount must be positive.");  
        }
    }

    public boolean withdraw(double amount)
    {       
        if (amount <= 0)
        {            System.out.println("Withdrawal amount must be positive.");     
            return false;     
        }     
        if (amount > balance)
        {          
            System.out.println("Insufficient balance. Withdrawal failed.");        
            return false;      
        }    
        balance -= amount;     
        System.out.println("Withdrawn: " + amount);    
        return true;   
    }
    
    public double getAccountNumber()
    {
        return accountNumber;
    }
    
    
}





