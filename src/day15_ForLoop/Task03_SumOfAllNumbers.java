package day15_ForLoop;

import java.util.Scanner;

public class Task03_SumOfAllNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        int sumNumber = 0;

        for (int i = 1; i < number ; i++) {
            sumNumber += i;
        }

        System.out.println("sumNumber = " + sumNumber);

        scan.close();
    }
}
/*3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275 */