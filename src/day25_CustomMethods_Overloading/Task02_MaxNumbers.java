package day25_CustomMethods_Overloading;

public class Task02_MaxNumbers {

    public static void main(String[] args) {

        System.out.println("------------- 1 ---------------");

        int[] num1 = {1,3,5,7,9 };
        int maxNum = max(num1);
        System.out.println("Max integer number = " + maxNum);
        System.out.println("Max integer number = " + max(num1));

        System.out.println("------------- 2 ---------------");

        double[] num2 = {10.5, 1.2, 2.5, 5.5};
        double maxDouble = max(num2);
        System.out.println("Max double number = " + maxDouble);
        System.out.println("Max double number = " + max(num2));

        System.out.println("------------- 3 ---------------");

        long[] num3 = {5, 10, 15, 55};
        long maxLong = max(num3);
        System.out.println("Max long number = " + maxLong);
        System.out.println("Max long number = " + max(num3));

    }
    public static int max (int[]number){

        int max = number[0];
        for (int each : number) {
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static double max(double[]number){

     double max = number[0];
     for(double each : number){
         if(each > max){
            max=each;
         }
     }
     return max;
    }
    public static long max(long[] number){

        long max = number[0];
        for(long each : number){
            if(each>max){
                max=each;
            }
        }
        return max;
    }


}
/*Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
*/