package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        scan.close();

        char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = lastName.toUpperCase().charAt(0);

        String result = firstNameChar + "." + lastNameChar+ ".";

        System.out.println(result);


        String s1 = "I love you";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1);

    }
}
/*
4. write a program that can return the initials of the user
            ex:
                cydeo
                school
            output:
                C.S
        Note: Pay attention to the example output
 */