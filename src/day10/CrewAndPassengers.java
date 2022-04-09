package day10;

import java.util.Scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number;
        String result = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Given a number of people on the ship:");
        number = sc.nextInt();

        System.out.println("---------------if------------------");
        int crew = number*20/100;
        int passenger = number*80/100;

        if(number >=50 && number<=100){
          result = "Total: " + number + " = " + crew + " crew, " + passenger + " passenger";
        }else {
            result = "invalid number";
        }
        System.out.println(result);

        System.out.println("---------------nested if------------------");

        if(number == 50 || number == 75 || number == 100){
            if(number == 50){
                result = "20 crew, 30 passengers";
            }else if (number == 75){
                result = "25 crew, 50 passengers";
            }else{
                result = "30 crew, 70 passengers ";
            }
        }else{
            result = "invalid number";
        }
        System.out.println(result);


    }
}
/*Create a class called CrewAndPassengers, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/