package week10;


/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Shape
{
    String shape = "this is shape";
    abstract void calculateArea();
    abstract void calculatePerimeter();
    String ShapeInfo()
    {
        return shape;
        
    }
    
    
}