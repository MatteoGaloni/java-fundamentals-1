package org.learning.java;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter kilometers");
        int nKilometers = scan.nextInt();
        System.out.println("You have just entered " + nKilometers + " Km");

        System.out.println("What's your age?");
        int passengerAge = scan.nextInt();
        System.out.println("You are " + passengerAge + " years old");

        double pricePerKm = 0.21;
        int underDiscount = 20;
        int overDiscount =  40;
        double standardPrice = nKilometers * pricePerKm;
        double ticketPrice;

        if (passengerAge < 18){
            ticketPrice = standardPrice - (standardPrice * ((double) underDiscount /100));
            System.out.println( "20% off, the price is equal to " + ticketPrice + "€");
        } else if (passengerAge > 65) {
            ticketPrice = standardPrice - (standardPrice * ((double) overDiscount /100));
            System.out.println( "40% off, the price is equal to " + ticketPrice + "€");
        } else {
            ticketPrice = standardPrice;
            System.out.println("No discount, the price is equal to " + ticketPrice + "€");
        }

        scan.close();
    }
}
