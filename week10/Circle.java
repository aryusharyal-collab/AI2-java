package week10;


/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape implements Drawable
{
    private int r;
    float pi = 3.121f;
    public Circle(int r)
    {
        this.r = r;
    }
    
    void calculateArea()
    {
        System.out.println(2*pi*r*r + " is the area");
    }
    
    void calculatePerimeter()
    {
        System.out.println(2*pi*r + " is the perimeter");
    }
    
    public void draw()
    {
        System.out.println("Drawing Circle with radius=" + r);
    }
}