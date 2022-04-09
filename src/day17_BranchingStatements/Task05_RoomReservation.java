package day17_BranchingStatements;

import java.util.Scanner;

public class Task05_RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to reserve a room?");
        String str = scan.next().toLowerCase();

        int total = 0;

        while (!(str.equals("yes") || str.equals("no"))) {
            System.out.println("Invalid answer. Would you like to reserve a room? yes/no ");
            str = scan.next().toLowerCase();
        }

        if (str.equals("yes")) {
            System.out.println("Which type of room do you want to reserve? \n " +
                    "\t\tKing Bed == $120\n" +
                    "\t\tQueen Bed == $100\n" +
                    "\t\tSingle Bed == $80");

            String room = scan.nextLine().toLowerCase();
            scan.nextLine();

            while (!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))) {
                System.out.println("Invalid room, Please Re-select the room");
                room = scan.nextLine().toLowerCase();
            }

            System.out.println("How many days do you want to stay?");
            int day = scan.nextInt();

            if(room.equals("king bed")) {
                total += 120 * day;
            }else if(room.equals("queen bed")){
                total += 100 * day;
            }else{
                total += 80 * day;
            }
         //   total += (room.equals("king bed")) ? 120 : (room.equals("queen bed")) ? 100 : 80;
            System.out.println("Your total price is: $" + total);

        } else {

            System.out.println("Have a nice day");

        }



    }
}
/*5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)*/