package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class Task04_Reverse {
    public static void main(String[] args) {

        System.out.println("------------- 1 ---------------");
        int[] num1 = {1,2,3,4,5};
        int[] num2 = reverse(num1);
        System.out.println("Reverse integer = " + Arrays.toString(num2));
  //    System.out.println(reverse(Arrays.toString(num1)));

        System.out.println("------------- 2 ---------------");

        double[] num3 = {1.5,2.5,3.5,4.5};
        double[] num4 = reverse(num3);
        System.out.println("Reverse double = " + Arrays.toString(num4));

        System.out.println("------------- 3 ---------------");

        char[] ch1 = {'a','b','c','d','e'};
        char[] ch2 = reverse(ch1);
        System.out.println("Reverse char = " + Arrays.toString(ch2));

        System.out.println("------------- 4 ---------------");

        String[] str1 = {"Ayhan", "Rabia", "Beyza", "Yusuf", "Gul Huma"};
        String[] str2 = reverse(str1);
        System.out.println("Reverse String = " + Arrays.toString(str2));
    //  System.out.println(reverse(Arrays.toString(str1)));

    }
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];

        for (int i = array.length -1, j=0; i >=0 ; i--,j++) { // i=element, j = index number
            result[j] = array[i];
        }
        return result;
    }
    public static double[]reverse(double[]array){

        double[]result = new double[array.length];

        int j = 0;
        for (int i = array.length-1; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }
    public static char[] reverse(char[]array){

        char[]result = new char[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
           result [j++] = array[i];
        }
        return result;
    }
    public static String[] reverse(String[]array){

        String[] result = new String[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }

}
/*Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array*/