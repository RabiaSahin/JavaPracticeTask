package day23_CustomMethods_Void;

public class Task10_ConvertDollarToLira {
    public static void main(String[] args) {

        dollarToLira(100);
    }

    public static void dollarToLira(double dollarAmount){

        double lira = dollarAmount * 14.84; // 1 dollar 14.84

        System.out.println(dollarAmount+" dollar = "+lira+" lira");
    }
}
/*10. create a method that can can convert dollar to lira*/