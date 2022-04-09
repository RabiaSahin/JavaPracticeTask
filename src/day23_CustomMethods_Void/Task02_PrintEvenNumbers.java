package day23_CustomMethods_Void;

public class Task02_PrintEvenNumbers {
    public static void main(String[] args) {

        printEvenNumbers();

    }
    public static void printEvenNumbers(){
        for (int i = 1; i < 100 ; i++) {
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
/*2. create a method that can print even numbers between 1~100 in a same line
saperated by space
*/