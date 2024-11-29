package Class;

import java.util.Scanner;

public class SentToDollarsScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents: ");
     int cent = input.nextInt();
      int dollar = cent/100;
      int a = cent%100;
       System.out.println(cent + " cent is equal to " + dollar +" dollars" + " and "+ a +" cents");
    }
}
/*
Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents
 */
