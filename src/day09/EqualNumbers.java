package day09;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write three numbers:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        if(n1 == n2 && n1 == n3){
            System.out.println("all equal");
        }else if(n1 == n2){
            System.out.println("n1&n2 equal");
        }else if(n1 == n3){
            System.out.println("n1&n3 equal");
        }else if(n2 == n3){
            System.out.println("n2&n3 equal");
        }else{
            System.out.println("none of them are equal");
        }


    }
}
/*Create a class called EqualNumbers, and write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal    */