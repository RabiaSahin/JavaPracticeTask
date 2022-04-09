package day11;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "tall";
        String result = "";

        System.out.println("----------if statement-----------");

       if( size == "tall" || size == "grande" || size == "venti") {
           if (size == "tall") {
               result = "prise is $3.69 \n" + "90 calories";
           }else if (size == "grande"){
               result = "prise is $3.99 \n" + "120 calories";
           }else {
               result = "prise is $4.29 \n" + "150 calories";
           }
       }else{
           result = "invalid size";
       }
        System.out.println(result);

        System.out.println("---------switch statement-----------");

 //      boolean validSize = size == "tall" || size == "grande" || size == "venti";

       switch (size){
           case "tall":
               result = "prise is $3.69 \n" + "90 calories";
               break;
           case "grande":
               result = "prise is $3.99 \n" + "120 calories";
               break;
           case "venti":
               result = "prise is $4.29 \n" + "150 calories";
               break;
           default:
               result = "invalid size";
       }
        System.out.println(result);

        System.out.println("-------if & switch statement---------");

        if( size == "tall" || size == "grande" || size == "venti") {
            switch (size) {
                case "tall":
                    result = "prise is $3.69 \n" + "90 calories";
                    break;
                case "grande":
                    result = "prise is $3.99 \n" + "120 calories";
                    break;
                case "venti":
                    result = "prise is $4.29 \n" + "150 calories";
                    break;
            }
        }else{
            result = "invalid size";
        }
        System.out.println(result);

    }
}
/*1. Create a class called  CappuccinoBuyer. A variable named Size is given,
 write a program that can display the price and calories of cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed   */