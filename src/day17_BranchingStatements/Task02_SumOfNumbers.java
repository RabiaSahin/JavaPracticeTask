package day17_BranchingStatements;

import java.util.Scanner;

public class Task02_SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

        System.out.println("Enter your first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scan.nextInt();

            System.out.println("Addition: " + (num1 + num2));

        if (!(num1>=0 && num2>=0)){
            System.out.println("Invalid number!");
            break;
        }
          //  break;
        }


    }
}
/*2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop*/