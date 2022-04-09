package day25_CustomMethods_Overloading;

public class Task03_MinNumber {
    public static void main(String[] args) {

        System.out.println("------------- 1 ---------------");
        int[] num1 = {2,4,6,8,10};
        int minNum = min(num1);
        System.out.println("Min integer number = " + minNum);
        System.out.println("Min integer number = " + min(num1));

        System.out.println("------------- 2 ---------------");

        double[] num2 = {10.5, 7.5, 1.5, 3.5, 5.5};
        double minDouble = min(num2);
        System.out.println("Min double number = " + minDouble);
        System.out.println("Min double number = " + min(num2));

    }

    public static int min (int[] number){
        int min = number[0];
        for(int each : number){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
    public static double min(double[]number){

        double min = number[0];
        for(double each : number){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
}
/*Task 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array*/