package week12;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */






public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ayush", "L1N1", "9876543210"));
        students.add(new Student("Rahul", "L1M1", "9876543211"));
        students.add(new Student("Gaurav", "L1N2", "9876543212"));

        
        print(students);

        
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getName().equalsIgnoreCase("Gaurav")) {
                it.remove();
            }
        }
        print(students);

        
        students.add(0, new Student("Aavaya", "L1C1", "9876543213"));
        print(students);

        
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase("Rahul")) {
                s.setGroup("L1N2");
            }
        }
        print(students);

        
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase("Ayush")) {
                s.setName("Aayush");
            }
        }
        print(students);
    }

    static void print(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("----");
    }
}
