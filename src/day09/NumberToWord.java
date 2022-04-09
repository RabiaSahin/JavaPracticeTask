package day09;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        String result = "";

        System.out.println("--------------if + ternary------------");

        if(num>=0 && num<=9){
            result = (num == 0)? "Zero" :(num == 1) ? "one" :(num == 2)? "two" :(num == 3)? "three" :(num == 4)? "four"
                    :(num == 5)? "five" :(num == 6)? "six" :(num == 7)? "seven" :(num == 8)? "eight" : "nine";
        }else{
            result = "invalid number";
        }
        System.out.println(result);

        System.out.println("------------if + switch----------------");
        if(num>=0 && num<=9){
            switch (num){
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                    break;
                case 9:
                    result = "nine";
                    break;
            }
        }else{
            result = "invalid number";
        }
        System.out.println(result);
    }
}
/*Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One */