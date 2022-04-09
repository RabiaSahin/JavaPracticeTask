package day19_LoopPractice;

import java.util.Scanner;

public class IndexNumberOfFirstDuplicateCharacter {
    public static void main(String[] args) {


        String str = "abcdkkmmns";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if(ch == each){
                  count++;
                }
                if(count == 2){
                 //   continue;
                    result += ch;
                }
            }
        }

        System.out.println("First duplicated character is: " + result.charAt(0)
                + "\nIndex number of character : " + str.indexOf(result.charAt(0)));
    }
}
/*Write a program that can return the index number of the first duplicated character from a string*/