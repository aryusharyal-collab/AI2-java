package week12;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class ArrayListDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListDemo
{
    public static void main ()
    {
        ArrayList<String> listOfName = new ArrayList<>();
        System.out.println(listOfName.isEmpty());
        listOfName.add("Ram");
        listOfName.add("Shyam");
        listOfName.add("Atharva");
        
        System.out.println("SIze of array is : "+listOfName.size());
        
        listOfName.add(1,"lal");
        System.out.println("size of arraylist is: " + listOfName.size());
        System.out.println("the object at given index is: " + listOfName.get(1));
        System.out.println("object of an index is: " + listOfName.indexOf("lal"));
        System.out.println("the data of an arraylist is: " + listOfName);
        listOfName.set(3,"lam");
        System.out.println("the data of an arraylist is: " + listOfName);
        System.out.println("ttraversing using for loop");
        for(int i = 0 ; i<listOfName.size();i++)
        {
            System.out.println(listOfName.get(i)+ " " );
        }
        System.out.println();
        System.out.println("traversing using foreach loop");
        for(String s:listOfName)
        {
            System.out.print(s+"\t");
        }
        
        System.out.println();
        System.out.println("traversing using iterator");
        Iterator<String> it = listOfName.iterator();
        while(it.hasNext())
        {
            String s = it.next();
            
            if (s.equals("lam"))
            {
                it.remove();
                
            }
            System.out.println(s + "\t");
        }

       
    }
}