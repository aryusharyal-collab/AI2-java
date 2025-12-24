package week8;

/**
 * Write a description of class employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employee
{
    private int id;
    private String name;
    private double salary;
    
    public employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    
    public void display()
    {
        System.out.println("details of employees are:\n");
        System.out.println("id: " + id +" "+ "name: " + name+ " " + "salary: " + salary);
        System.out.println();
        
    }
    
    public double getsalary()
    {
        double annualsalary = this.salary*12;
        return annualsalary;
        
    }
    
    public void setName(String name)
    {
        this.name = name;
        
    }
    
    public int getId()
    {
        return this.id;
        
    }
}