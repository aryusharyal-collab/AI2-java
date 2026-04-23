package week9;


/**
 * Write a description of class p here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p
{
    private int VID;
    private String brand;
    private float price;
    
    public p (int VID, String brand, float price)
    {
        this.VID= VID;
        this.brand = brand;
        this.price = price;
    }
    
     void dispalyinfo()
    {
        System.out.println("id: " + VID);
        System.out.println("brand: "+ brand);
        System.out.println("price: " + price);
    }
    
    public float tax()
    {
        float t = price * 0.1f;
        return t;
    }
}