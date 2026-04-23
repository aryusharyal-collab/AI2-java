package week10;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private int id;
    private String name;
     public Person(int id, String name)
     {
         this.id = id;
         this.name= name;
         
        }
        
    int getId()
    {
        return id;
    }
    
    String getName()
    {
        return name;
    }
    
    int setId()
    {
        return this.id;
    }
    
    String setName()
    {
        return this.name;
    }
    
    float getSalary()
    {
        return 50000;
    }
    
    @Override
    public String toString()
    {
        return "name :" + name + "\n" + "ID: " + id;
    }
    
    
}