package day12;

import java.util.Scanner;

public class centToDollars {
    public static void main(String[] args) {

        int cents, dollars;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents: ");
        cents = input.nextInt();

        dollars = cents / 100;
        int remainingCent = cents % 100;

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + remainingCent + " cents");

    }
}
/*Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

*/