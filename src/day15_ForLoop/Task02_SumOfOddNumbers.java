package day15_ForLoop;

public class Task02_SumOfOddNumbers {
    public static void main(String[] args) {
        int sumOdd = 0;

        for (int i = 1; i < 100 ; i+=2) {
         //   if(i % 2 ==1){
                sumOdd += i;

        //    }
        }
        System.out.println("Total odd number= " + sumOdd);
    }
}
/*2. Write a program that can return the sum of odd numbers between 1 to 100
 */