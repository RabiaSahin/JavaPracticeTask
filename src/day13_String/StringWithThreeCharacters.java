package day13_String;

import java.util.Scanner;

public class StringWithThreeCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string text");

        String str = scan.nextLine();

        if(str.length() == 0){
            System.out.println("string is empty");
        }else if(str.length() > 3){
            System.out.println("" + str.charAt(str.length() -3) + str.charAt(str.length() -2) + str.charAt(str.length() -1));
        }else{
            System.out.println("Enter a string text");
        }

        System.out.println("---------github solution----------");
        String word = scan.nextLine();
        int length = word.length();
        String result = "";

        if(length == 0){
            result = "Empty";
        } else if (length > 3){
            int lastIndex = word.length() - 1;
            result = ""+ word.charAt(length - 3)+ word.charAt(length - 2)+ word.charAt(length - 1);
        }else {
            result = word;
        }
        System.out.println(result);


        scan.close();

    }
}
/*Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself  */