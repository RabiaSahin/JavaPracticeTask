package PracticeTasks.day13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word:");
        String str1 = scan.next();

        System.out.println("Enter your second word");
        String str2 = scan.next();

        System.out.println("Enter your third word");
        String str3 = scan.next();


        if(str1.length() == str2.length() && str2.length() == str3.length()){
            System.out.println("All words are same length");
        }else if(str1.length() == str2.length()){
            System.out.println("Not Same nor Different lengths");
        }else if (str1.length() == str3.length()) {
            System.out.println("Not Same nor Different lengths");
        }else if (str2.length() == str3.length()){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different length");
        }

        scan.close();
    }
}
/*Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length" */