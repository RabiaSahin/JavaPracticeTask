package day23_CustomMethods_Void;

public class Task06_CalculateCircle {
    public static void main(String[] args) {

        areaOfCircle(3.5);
    }
    public static void areaOfCircle(double radius){ // radius = yaricap area = r*r*pi

        double area = radius * radius * 3.14;

        System.out.println("Area of circle = " + area);
    }
}
/*	6. create a method that can calculate the area of a circle*/