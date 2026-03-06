package week17;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student {
    String studentId;
    String name;
    String course;

    public Student(String studentId, String name, String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    public String getHTML() {
        return "<html>"
                + "ID: " + studentId + "<br>"
                + "Name: " + name + "<br>"
                + "Course: " + course
                + "</html>";
    }
}