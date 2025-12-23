package week7;
import java.util.Scanner;


/**
 * Write a description of class laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class laptop
{
    
    
    public static void main(String[] args)
    {
    laptops l1 = new laptops ("dell", 4, 45000);
    laptops l2 = new laptops ("asus", 10,78900);
    laptops l3 = new laptops ("mac", 15, 350000);
    
    System.out.println("laptops details of RAM above 8 GB\n");
    
    if (l1.ram> 8)
    l1.display();
    
    if(l2.ram > 8)
    l2.display();
    
    if(l3.ram> 8)
    l3.display();
    
        
      
    }
}     
    
    class laptops
    {
        String brand;
        int ram;
        float price;
    
     laptops( String brand, int ram, float price) //constructor
    {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
        
    }
      void display() {
            System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Price: " + price);
        System.out.println("----------------------");
        }
}
    
