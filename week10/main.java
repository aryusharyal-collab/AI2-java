package week10;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main()
    {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(4,5);
        shapes[1] = new Circle(7);
        
        for(Shape s : shapes)
        {
           s.ShapeInfo();
           s.calculateArea();
           s.calculatePerimeter();
        
        
        if (s instanceof Drawable)
        {
            ((Drawable)s).draw();
            

        }
    }
}
}