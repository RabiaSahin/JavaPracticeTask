package day13_String;

import java.util.Scanner;

public class SameFirstAndLastChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = scan.nextLine();

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() -1);

       if(firstChar == lastChar){
           System.out.println("first char and last char are same");
       }else{
           System.out.println("first char and last char are NOT same");
       }
        scan.close();

    }
}
/*write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same    */