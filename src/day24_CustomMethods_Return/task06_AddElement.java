package day24_CustomMethods_Return;

import java.util.Arrays;

public class task06_AddElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        arr = addElement(arr, 4);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] addElement(int[] arr, int num){

        int[] result = new int[arr.length+1];

        int i = 0;
        for (int eachArr : arr){
            result[i++] = eachArr;
        }
        result[i] = num;

        return result;
    }
}
/* 6. create a method named addElement that takes one integer array and one integer,
the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}*/