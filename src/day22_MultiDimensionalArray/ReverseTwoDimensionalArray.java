package day22_MultiDimensionalArray;


import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {

        int [][] array = { {1,2,3}, {4,5,6}};

     /*   for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/

        int [][] reverse = new int [array.length][];

        for (int i = array.length - 1, a = 0 ; i >= 0; i--,a++) {
            reverse[a] = array[i];
            int [] temp = Arrays.copyOf(reverse[a],reverse[a].length);// temporary array variable to hold the elements

            for (int j = temp.length - 1, b = 0; j >= 0; j--,b++) {
                reverse[a][b] = temp[j];
            }

        }
        System.out.println(Arrays.deepToString(reverse));


    }
}
/*1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

		output:
			reverse = { {6,5,4}, {3,2,1},};
*/