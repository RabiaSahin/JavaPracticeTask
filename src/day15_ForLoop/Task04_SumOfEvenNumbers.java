package day15_ForLoop;

public class Task04_SumOfEvenNumbers {
    public static void main(String[] args) {

        int sumEven = 0;

        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 ==0){
                sumEven += i;

            }
        }
        System.out.println("Total even number = " + sumEven);
    }
}
/*1. Write a program that can return the sum of even numbers between 1 to 100   */