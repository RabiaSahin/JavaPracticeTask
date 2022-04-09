package day23_CustomMethods_Void;

public class Task05_CalculateGrade {
    public static void main(String[] args) {

        grade(65);
    }

    public static void grade(int score){

        String grade = "";

        if(score>=90){
            grade = "A";
        }else if(score>=80){
            grade = "B";
        }else if(score>=70){
            grade = "C";
        }else if(score>=60){
            grade = "D";
        }else{
            grade = "E";
        }
        System.out.println("grade = " + grade);
    }
}
/*5. create a method that can calculate the grade of the student based on the score
 */