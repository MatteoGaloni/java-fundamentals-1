package org.learning.java;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = scan.nextLine();
        System.out.println("Insert you family name");
        String familyName = scan.nextLine();
        System.out.println("What's your favourite color?");
        String color = scan.nextLine();
        System.out.println("What day were you born?");
        int day = scan.nextInt();
        System.out.println("What month were you born?");
        int month = scan.nextInt();
        System.out.println("What year were you born");
        int year = scan.nextInt();

        String specialChar = "-";
        int birthdaySum = day + month + year;

        String password = name + specialChar + familyName + specialChar + color + specialChar + birthdaySum;

        System.out.println("Your new password is " + password);

        scan.close();
    }
}
