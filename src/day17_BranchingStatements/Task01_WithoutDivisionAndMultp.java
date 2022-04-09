package day17_BranchingStatements;

import java.util.Scanner;

public class Task01_WithoutDivisionAndMultp {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first positive number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter a second positive number: ");
        int num2 = scan.nextInt();

        int count = 0;

        while (num1>=num2){
            num1 -= num2;
            count++;
        }
     //   System.out.println(num1 + " / " + num2 + " = " + count
     //           + "\n"  + count + " with a remainder of " + num1 );
        System.out.println(count + " with a remainder of " + num1);

    }
}
/*1. Write a program that can divide two positive numbers without using / (division)
and * (multiplication) operators.
 */