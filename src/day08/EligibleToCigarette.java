package day08;

import java.util.Scanner;

public class EligibleToCigarette {

    public static void main(String[] args) {
        byte age;
        boolean ID;
        String result = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age:");
        age = scan.nextByte();
        System.out.println("Enter ID");
        ID = scan.nextBoolean();

        if(age >=18){
            if(ID){
                result = "Eligible to by cigarettes";
            }else{
                result = "Need to ID";
            }
        }else{
            result = "Not eligible";
        }
        System.out.println(result);
    }
}
/*1. Given a number (byte) age,
write a program that can check if the person is eligible to buy Cigarettes  */

