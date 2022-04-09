package day09;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection;
        Scanner scan = new Scanner(System.in);
        System.out.println("Selection of a number between 1~5:");
        selection = scan.nextInt();

        String result = "";

        if(selection>=1 && selection<=5){
            switch (selection){
                case 1:
                    result = "for 1: Hello, thanks for your call";
                    break;
                case 2:
                    result = "for 2: Hola, gracias para llamar";
                    break;
                case 3:
                    result = "for 3: Merhaba, aradiginiz icin tesekkurler";
                    break;
                case 4:
                    result = "for 4: Privet, spasibo za vash zvonok";
                    break;
                case 5:
                    result = "for 5: Merci ,pour votre appel";
                    break;
            }

        }else{
            result = "invalid number";
        }
        System.out.println(result);


    }
}
/*Create a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5,
Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thanks for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
*/