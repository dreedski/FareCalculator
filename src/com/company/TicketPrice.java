package com.company;
import java.util.Scanner;
//package com.company;


public class TicketPrice {
    private int age;
    private double tax, standardPrice, totalPrice, totalTax;
    Scanner in = new Scanner(System.in);

    public TicketPrice() {
        this.age = age;
        this.tax = tax;
        this.standardPrice = standardPrice;
        this.totalPrice = totalPrice;
        this.totalTax = totalTax;


        //int age;
        //double tax, standardPrice, totalPrice, totalTax;

        totalPrice = 0;
        tax = 0.13;
        System.out.println("Please enter your age: ");
        age = in.nextInt();

        if (age <= 10) {
            standardPrice = 5.00;
            totalTax = tax * standardPrice;
            totalPrice = standardPrice + totalTax;
        } else if (age > 10 && age <= 18) {
            standardPrice = 10.00;
            totalTax = tax * standardPrice;
            totalPrice = standardPrice + totalTax;
        } else {
            standardPrice = 15.00;
            totalTax = tax * standardPrice;
            totalPrice = standardPrice + totalTax;
        }

        System.out.println("You total ticket cost is: " + String.format("%.2f",totalPrice));
    }
}

