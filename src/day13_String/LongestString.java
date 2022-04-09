package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first string: ");
        String str1 = scan.nextLine();

        System.out.println("Enter your second string: ");
        String str2 = scan.nextLine();

        String result = "";

        if(str1.length() > str2.length()){
            result = "longest string = " + str1;
        }else{
            result = "longest string = " + str2;
        }
        System.out.println(result);

        scan.close();
    }
}
/* write a program that asks user to enter two strings, and print out the longest string
 */