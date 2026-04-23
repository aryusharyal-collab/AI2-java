package week9;


/**
 * Write a description of class c here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class c extends p
{
   private int doors;
   public c(int VID, String brand, float price, int doors)
   {
       super(VID,  brand,  price);
       this.doors = doors;
       
       
    }
    
    @Override
    public void dispalyinfo()
    {
        super.dispalyinfo();
        System.out.println("no of door: " + doors);
        super.tax();
        
    }
    
    
}