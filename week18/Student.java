package week18;

 import java.util.ArrayList;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int id;
    private String name;
    private String gender;
    private String skill;
    private String course;

    static ArrayList<Student> list = new ArrayList<>();

    public Student(int id, String name, String gender, String skill, String course) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.skill = skill;
        this.course = course;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getSkill() { return skill; }
    public String getCourse() { return course; }

    public static boolean addStudent(Student s) {
        for(Student st : list) {
            if(st.getId() == s.getId()) return false;
        }
        list.add(s);
        return true;
    }

    public static void viewStudents() {
        for(Student s : list) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse());
        }
    }

    public static boolean deleteStudent(int id) {
        for(Student s : list) {
            if(s.getId() == id) {
                list.remove(s);
                return true;
            }
        }
        return false;
    }
}
