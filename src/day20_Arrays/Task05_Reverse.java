package day20_Arrays;

import java.util.Arrays;

public class Task05_Reverse {
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};

        int [] numbers = new int[array.length];

        int j = 0;
        for (int i = array.length-1; i >= 0; i--,j++) {
            numbers[j] = array[i];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
/*5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
*/