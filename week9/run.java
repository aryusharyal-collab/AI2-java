package week9;


/**
 * Write a description of class run here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class run
{
    public static void main()
    {
        bike b1 = new bike();
        b1.color = "red";
        b1.maxSpeed = 34;
        b1.wheelie();
        
        buggi bu1 = new buggi();
        bu1.color = "blue";
        bu1.maxSpeed = 55;
        bu1.fly();
    }
}