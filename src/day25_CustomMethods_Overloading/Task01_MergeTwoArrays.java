package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class Task01_MergeTwoArrays {
    public static void main(String[] args) {

        System.out.println("------------- 1 ---------------");
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {6,7,8,9,10};

        int[] num3 = merge(num1, num2);
        System.out.println(Arrays.toString(num3));

        System.out.println("------------- 2 ---------------");
        double[] num4 = {1.5, 2.5, 3.5};
        double[] num5 = {4.5, 5.5, 6.5};

        System.out.println(Arrays.toString(merge(num4, num5)));

        System.out.println("------------- 3 ---------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E'};
        char[] ch2 = {'F', 'G', 'H', 'I', 'J'};

        char[] ch3 = merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("------------- 4 ---------------");

        String[] str1 = {"Banana", "Pineapple"};
        String[] str2 = {"Apple", "Orange"};

        System.out.println(Arrays.toString(merge(str1, str2)));
    }
    public static int[] merge(int[] num1, int[] num2){
        int[] result = new int[num1.length + num2.length];

        int i = 0;
        for (int each : num1) {
            result[i++] = each;
        }
        for (int each : num2) {
            result[i] = each;
            i++;
        }
        return result;
    }
    public static double[] merge (double[] num1, double[] num2){
        double[] result = new double[num1.length + num2.length];

        int i = 0;
        for (double each : num1) {
            result[i++] = each;
        }
        for (double each : num2){
            result[i++] = each;
        }
        return result;
    }
    public static char[] merge(char[] ch1, char[] ch2){
        char[] result = new char[ch1.length + ch2.length];
        
        int i = 0;
        
        for( char each : ch1){
            result[i++] = each;
        }
        for( char each : ch2){
            result[i++] = each;
        }
        return result;
    }
    public static String [] merge(String[] str1, String[] str2){
        String[] result = new String[str1.length + str2.length];

        int i = 0;
        for( String each : str1){
            result [i++] = each;
        }
        for ( String each : str2) {
            result [i++] = each;
        }
        return result;
    }

}
/*1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

*/