package day05;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {

        int countryCode, areaCode, localNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one number country code:");
        countryCode = scan.nextInt();
        System.out.println("Enter three number for area code:");
        areaCode = scan.nextInt();
        System.out.println("Enter seven number for local number");
        localNumber = scan.nextInt();

        System.out.println("+" + countryCode + "(" + areaCode + ")-" + localNumber);
    }
}
