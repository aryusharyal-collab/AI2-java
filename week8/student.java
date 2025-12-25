package week8;

/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private static String collegeName;
    public student (int id, String name, String address, long phoneNumber, String collegeName)
    {
        this.id = id;
        this.name= name;
        this. address = address;
        this.phoneNumber =  phoneNumber;
        this.collegeName = collegeName;
    }

    public void displayInfo()
    {      
        System.out.println("Student Details:");      
        System.out.println("ID           : " + id);  
        System.out.println("Name         : " + name);       
        System.out.println("Address      : " + address);     
        System.out.println("Phone Number : " + phoneNumber);   
        System.out.println("College Name : " + collegeName); 
        System.out.println();
    }
}