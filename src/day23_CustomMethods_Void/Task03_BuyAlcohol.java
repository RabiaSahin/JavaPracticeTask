package day23_CustomMethods_Void;

public class Task03_BuyAlcohol {
    public static void main(String[] args) {

        eligible(15);

    }
    public static void eligible(int age){

        if(age>=18){
            System.out.println("You can buy alcohol");
        }else{
            System.out.println("You can not buy alcohol!");
        }
    }
}
