package week10;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape implements Drawable
{
    private int l,b;
    
    public Rectangle(int l, int b)
    {
        this.l = l;
        this.b = b;
    }
    
    
    void calculateArea()
    {
      System.out.println(l*b + "is the area ");
    }
    
    
    void calculatePerimeter()
    {
        System.out.println(2*(l+b) + "is the  perimeter");
        
    }
    
    public void draw()
    {
        System.out.println("Drawing Rectangle with length="
                            + l + " and breadth=" + b);
    }
}