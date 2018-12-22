package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int tickets = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int roundTrip = scanner.nextInt();
        if (tickets > 0 && roundTrip > 0 && tickets >= roundTrip) {
            Ticket ticket = new Ticket(tickets, roundTrip);
            ticket.cal();
        }
        else {
            System.out.println("輸入票數值有誤!!!");
        }
    }
}
