package week20;
import java.util.ArrayList;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private String course;
    private String gender;
    private ArrayList<String> hobbies = new ArrayList<>();
    
    public Student (String name, String course, String gender, ArrayList<String> hobbies)
    {
        this.name = name;
        this.course = course;
        this.gender = gender;
        this.hobbies = hobbies;
    }
    
    @Override
    public String toString()
    {
        return "name is " + name + "\t"
        + "course is " + course + "\t" 
        + "gender is " + gender + "\t"
        + "hobbies is " + hobbies;
        
    }
    
}