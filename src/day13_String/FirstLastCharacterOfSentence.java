package day13_String;

import java.util.Scanner;

public class FirstLastCharacterOfSentence {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();

        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt( sentence.length()-1 );

        String result = firstChar + "" + lastChar;

        System.out.println(result);

        scan.close();

    }
}
/*write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence*/