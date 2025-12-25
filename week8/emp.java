package week8;


/**
 * Write a description of class emp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class emp
{
    private double basicSalary;
    
    
    public emp (double basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    public double calculateGrossSalary()
    {
        double bonus = 0.20 * basicSalary; 
        return basicSalary + bonus; 
        
    }
    
    public double getBasicSalary() 
    {     
        return basicSalary; 
    }
    
}