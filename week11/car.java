package week11;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car extends vehicle
{ 
    
   private int numberofdoor;
    public car (int modelNo, String brand, int price, int numberofdoor)
    {
        super(modelNo,brand,price);
        this.numberofdoor = numberofdoor;
    }
    
    @Override 
    public void start()
    {
        System.out.println("car started");
        
    }
    
    @Override
    public void stop()
    {
        System.out.println("car stopped");
    }
    
    @Override
    public void fuleType()
    {
        System.out.println("petrol");
    }
    
}
    
