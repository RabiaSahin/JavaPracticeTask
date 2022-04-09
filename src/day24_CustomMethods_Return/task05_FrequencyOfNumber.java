package day24_CustomMethods_Return;

public class task05_FrequencyOfNumber {
    public static void main(String[] args) {

        int [] array = {1,1,1,1,1,2,2,5,7,6,5,3,5};
        int number = 5;

        frequencyOfNumber(array,number);

    }

    public static int frequencyOfNumber(int[] array, int number){

        int frequency = 0;

        for (int num : array) {
            if(num == number){
                frequency ++;
            }
        }
        System.out.println(frequency);
        return frequency;

    }
}
/* 5. create method that accepts one integer array and one integer number and
returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
*/