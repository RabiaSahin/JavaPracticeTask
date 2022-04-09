package day08;

import java.util.Scanner;

public class SchoolType {
    public static void main(String[] args) {

        byte gradeLevel;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade level:");
        gradeLevel = scan.nextByte();

        String result = "";

        if(gradeLevel>1 && gradeLevel<18){
            if(gradeLevel>=1 && gradeLevel<=5){
                result = "Elementary School";
            }else if(gradeLevel>=6 && gradeLevel<=8){
                result = "Middle school";
            }else if(gradeLevel>=9 && gradeLevel<=12){
                result = "High School";
            }else if(gradeLevel>=13 && gradeLevel<=16){
                result = "College";
            }else{
                result = "Grad School";
            }
        }else{
            result = "invalid grade";
        }
        System.out.println(result);
    }
}
/*Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18  */