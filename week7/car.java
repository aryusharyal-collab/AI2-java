package week7;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car
{
   int model;   // instance variable
   String brand;
   double price;
   
   void start() //behaviour or method
   {
       System.out.println("car start");
       
    }
    
    void stop()
    {
        System.out.println("car stop");
        
    }
    
    public static void main(String[]args)
    {
        car c1;
        c1= new car();
        
        c1.start(); // calling the method
         c1.model = 123;
         c1.brand = "BMW";
         c1.price = 999999;
         
         System.out.println("Model number is: " + c1.model );
         System.out.println("Brand is: " + c1.brand);
         System.out.println("Price is: " + c1.price);
         c1.stop();
         
         car c2;
         c2 = new car();
         c1.start();
         c2.brand = "porsche";
         c2.model = 911;
         c2.price = 250000;
         System.out.println("Model number is: " + c2.model );
         System.out.println("Brand is: " + c2.brand);
         System.out.println("Price is: " + c2.price);
         c1.stop();
         
         car c3;
         c3 = new car();
         c1.start();
         c3.model= 123;
         c3.brand = "lambo";
         c3.price = 55000;
         System.out.println("Model number is: " + c3.model );
         System.out.println("Brand is: " + c3.brand);
         System.out.println("Price is: " + c3.price);
         c1.stop();
         
         car c4;
         c4 = new car();
         c1.start();
         c4.model = 134343;
         c4.brand = "tyota";
         c4.price = 3435343;
         System.out.println("Model number is: " + c4.model );
         System.out.println("Brand is: " + c4.brand);
         System.out.println("Price is: " + c4.price);
         c1.stop();
         
         
    }
    
}