package day05;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        String from, to;
        double ticketPrice;

        Scanner scan = new Scanner(System.in);
        System.out.println("Write where does the passenger fly from:");
        from = scan.nextLine();
        System.out.println("Write where does the passenger to fly:");
        to = scan.nextLine();
        System.out.println("Write a ticket price:");
        ticketPrice = scan.nextDouble();

        System.out.println("ticket is ready\n" + "From " + from + " to " + to + " is $" + ticketPrice);
    }
}
