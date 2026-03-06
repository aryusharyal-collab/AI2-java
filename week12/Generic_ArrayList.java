package week12;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Generic_ArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Generic_ArrayList
{
    public static void main ()
    {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(123);
        numbers.add(20);    
        numbers.add(30);

        names.add("Aryush");  
        names.add("Sam");    
        names.add("Rita");
        
        for (int n : numbers) 
        {         
            System.out.println(n);  
        }   
        for (String n : names) 
        {         
            System.out.println(n);  
        }     
        Iterator<Integer> numIterator = numbers.iterator();   
        while (numIterator.hasNext())
        {         
            System.out.println(numIterator.next()); 
        }     
        Iterator<String> nameIterator = names.iterator();  
        while (nameIterator.hasNext())
        {         
            System.out.println(nameIterator.next());    
        }
        
        Iterator<String> it = names.iterator();   
        int idx = 0;    
        while (it.hasNext()) 
        {         
            it.next();  
            if (idx == 2) 
            {        
                it.remove();      
                break;     
            }      
            idx++;    
        }
        
        System.out.println(names.size());   
        System.out.println(numbers.size());
        
        numbers.clear();
        
        
        System.out.println(names.get(2));   
        System.out.println(names.get(3));
        

    }
}