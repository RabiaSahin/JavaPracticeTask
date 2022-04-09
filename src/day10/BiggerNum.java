package day10;

import java.util.Scanner;

public class BiggerNum {
    public static void main(String[] args) {

        int n1, n2, n3;
        int largest = 0;
        String result = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();

        System.out.println("----------first option----------");
        if(n1 > largest){
            largest = n1;
            result = "n1 is bigger";
        }if(n2 > largest){
            largest = n2;
            result = "n2 is bigger";
        }if(n3 > largest){
            largest = n3;
            result = "n3 is bigger";
        }
        System.out.println(result);

        System.out.println("---------second option----------");

        largest = (n1>largest)? n1 : largest;
        largest = (n2>largest)? n2 : largest;
        largest = (n3>largest)? n3 : largest;

        System.out.println(largest);




    }
}
/*Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY */