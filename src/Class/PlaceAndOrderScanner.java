package Class;

import java.util.Scanner;

public class PlaceAndOrderScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fist name");
        String firstname = input.nextLine();

        System.out.println("Enter product name");
        String productName = input.nextLine();
        System.out.println("Enter your price");
        double price = input.nextDouble();
        System.out.println("Enter your quantity");
        int quantity = input.nextInt();
        System.out.println(firstname + " " +"your order for " + quantity + " " + productName + " " + " has been placed. "
        + "\nYour total price is " + price + "$");
    }

}
/*
Create a class named PlaceAnOrder:

    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.
 */