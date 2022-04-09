package day14_String;

import java.util.Scanner;

public class AddTwoWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String firstWord = scan.next();

        System.out.println("Enter your second word:");
        String secondWord = scan.next();

        boolean sameChar = firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0);

        if(sameChar){
            System.out.println(firstWord + secondWord.substring(1));
        }else{
            System.out.println(firstWord + secondWord);
        }
        scan.close();
    }
}
/*Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
*/