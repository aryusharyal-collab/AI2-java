package week7;


/**
 * Write a description of class book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class book
{
   String title;
   String author;
   int price;
   
   public static void main ()
   {
       book book1 = new book();
       book1.title = "Hundred splended sun";
       book1.author = "idk";
       book1.price = 750;
       
       book book2 = new book();
       book2.title = "the teachers";
       book2.author = "hola koi";
       book2.price = 850;
       
       book1.display();
       book2.display();
    }
    
    void display()
    {
        System.out.println("Title: "+ title);
        System.out.println("author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}