package lab7;

import java.util.Random;
import java.util.Scanner;

public class TestShoppingCart {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // this program ONLY ALLOW you to buy apples.
        ShoppingCart shoppingCart = new ShoppingCart();
        while(true) {

            System.out.println("Do you want to buy some APPLES (y/n)?");
            String answer = scanner.next();
            if (answer.toUpperCase().equals("N")) break;

            System.out.println("How many APPLES do you want to buy ?");
            int quantity = scanner.nextInt();

            System.out.printf("Buy Successfully! Let's see your shopping cart: ");
            shoppingCart.addToCart("Apple", new Random().nextInt(10000), quantity);
            System.out.println(shoppingCart);
        }
    }
}

