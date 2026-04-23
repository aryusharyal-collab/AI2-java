package week23;
import java.util.ArrayList;

public class Test
{
    public static void main()
    {
        Person p1 =new Student("laal", 99, "AI");
        Person p2 = new Teacher("skjdnf", 990, "java");
        
        ArrayList<Person> l = new ArrayList<>();
        l.add(p1);
        l.add(p2);
        
        for(Person x:l)
        {
            String role = x.performRole();
            System.out.println(role);
        }
        
        for(Person person:l)
        {
            if (person instanceof Teacher t)
            {
                //Teacher t = (Teacher)person;
                System.out.println(t.takeLecture());
            }
        }
    }
    
}