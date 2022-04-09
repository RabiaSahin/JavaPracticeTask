package day13_String;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        scan.close();

        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else{
            System.err.println("Incorrect username or password");
        }


    }
}
