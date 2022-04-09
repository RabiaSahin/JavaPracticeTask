package day23_CustomMethods_Void;

public class Task09_ConvertDollarToEuro {
    public static void main(String[] args) {

        dollarToEuro(100);
    }

    public static void dollarToEuro(double dollarAmount){

        double euro = dollarAmount*0.91; // 1 dollar 0.91 euro

        System.out.println(dollarAmount + " dollar = " + euro + " euro");
    }
}
/*9. create a method that can convert dollar to euro    */