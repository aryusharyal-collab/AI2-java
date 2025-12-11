package week6;


/**
 * Write a description of class miniSeating2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class miniSeating2D
{
    public static void main()
    {
        String[][] seats = new String[2][3];
        seats[0][0] = "saksham";
        seats[0][1] = "laal";
        seats [0][2] = "aryush";
        
        System.out.println("Seating Chart:");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {

                
                if (seats[i][j] == null || seats[i][j].isEmpty()) {
                    System.out.print("[empty] ");
                } else {
                    System.out.print(seats[i][j] + " ");
                }
        
        
    }
}
System.out.println();
}
}