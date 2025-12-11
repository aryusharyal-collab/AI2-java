package week6;


/**
 * Write a description of class MiniBookCorner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniBookCorner
{
    public static void main()
    {
        String[] categories = {"Fiction", "Nepali"};
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];
        titles[0][0] = "AsahamatI - 5";   
        prices[0][0] = 750.0;
        titles[1][0] = "Muna-Madan";     
        prices[1][0] = 500.0;
        System.out.println("Mini Book Corner:\n");
         for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            System.out.println("Title: " + titles[i][0]);
            System.out.printf("Price: %.2f\n\n", prices[i][0]); 
        }



    }
}