package week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person
{
    String shift;
    float extraAllowance;
    
    public Nurse (int id, String name, String shift, float extraAllowance)
    {
        super(id, name);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }
    
    @Override
    float getSalary()
    {
        return super.getSalary() + extraAllowance * 500;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\n" +
        "Shift: " + shift + "\n" +
        "Extra Allowance: " + extraAllowance + "\n" +
        "Salary: " + getSalary() ;
    }
    
}