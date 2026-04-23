package week10;


/**
 * Write a description of class Docter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Docter extends Person
{
    String specialization;
    float fee;
    
    public Docter (int id, String name, String specialization, float fee)
    {
        super(id, name);
        this.specialization = specialization;
        this.fee = fee;
    }
    
    @Override
    float getSalary()
    {
        return super.getSalary() + fee * 700;
    }
    
    float getSalary(int emergency)
    {
        return getSalary() + (emergency *2000);
        
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\n" +
        "Specialization: " + specialization + "\n" +
        "Counsaltation Fee: " + fee + "\n" +
        "Salary: " + getSalary();
        
        
    }
}