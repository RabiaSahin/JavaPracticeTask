package day27_WrapperClasses;

import java.util.Arrays;

public class Task01_InsertElement {
    public static void main(String[] args) {

     System.out.println("------------- 1 ---------------");
      int[] arr1 = {10,20,30,40,50};
      int[] result = insert(arr1,2,100);

      System.out.println(Arrays.toString(result));
  //  System.out.println(Arrays.toString(insert(arr1,2,100)));

    System.out.println("------------- 2 ---------------");

    double[] arr2 = {10.5,20.5,30.5,40.5,50.5};
    double[] result2 = insert(arr2, 2,100.5);
 //     System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(insert(arr2,2,100.5)));


    }
    public static int[] insert(int[]array, int index, int element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length + 1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) { // i=index num. j = element
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }
        return result;
    }
    public static double[]insert(double[]array, int index, double element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        double[] result = new double[array.length + 1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result [j] = array[i];
        }
        return result;
    }


}
/*1. Insert Task:
		1.1 Create a method named insert that passes three parameters:
		integer array, integer index, integer element.
		the method inserts the given element to the given index of the array
		and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

	1.2 Create the same function for double array, char array and string array*/