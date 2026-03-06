package week11;


/**
 * Write a description of class vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class vehicle implements Drivable
{
    private int modelNo;
    private String brand;
    private double price;
    
    public vehicle (int modelNo, String brand, double price)
    {
        this.modelNo = modelNo;
        this.brand = brand;
        this.price = price;
        
    }
    
    
    public abstract void fuelType ();
    @Override
    public String toString()
    {
        return "modelNo"+this.modelNo+"brand"+this.brand+"price"+this.price;
        
    }
}