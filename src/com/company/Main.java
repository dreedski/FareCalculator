package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Howe many tickets do you need? ");
        int numTickets = in.nextInt();



        //System.out.println("Please enter your age: ");
        //int age = in.nextInt();
        TicketPrice tickPrice = new TicketPrice();

       // System.out.println("Your ticket price is: " + String.format("%.2f",totalPrice));
    }
}