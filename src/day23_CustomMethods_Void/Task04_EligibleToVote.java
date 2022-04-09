package day23_CustomMethods_Void;

public class Task04_EligibleToVote {
    public static void main(String[] args) {

        eligibleToVote(25,"uk");

    }

    public static void eligibleToVote(int age, String citizen){
        if(age >= 18 && citizen.equalsIgnoreCase("USA")){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }
    }


}
/*4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
*/