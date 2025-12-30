package week8;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Wireless Mouse", 1500.0, 2);
        cart.displayCart();

        cart.setQuantity(3);
        System.out.println("Updated Quantity: " + cart.getQuantity());
        System.out.println("New Total: " + cart.calculateTotal());

        double discountedTotal = cart.calculateDiscountedTotal(15.0);
        System.out.println("Discounted Total (15%): " + discountedTotal);
    }
}