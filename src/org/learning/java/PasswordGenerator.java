package org.learning.java;

import java.util.Arrays;
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
//        soluzione A
//        System.out.println("What day were you born?");
//        int day = scan.nextInt();
//        System.out.println("What month were you born?");
//        int month = scan.nextInt();
//        System.out.println("What year were you born");
//        int year = Integer.parseInt(scan.nextLine());

//        soluzione B

        System.out.println("Enter your birthday DD/MM/YYYY");
        String birthday = scan.nextLine();

        String [] formatBirthday = birthday.split("/");
        System.out.println(Arrays.toString(formatBirthday));
        int formattedDay = Integer.parseInt(formatBirthday[0]);
        int formattedMonth = Integer.parseInt(formatBirthday[1]);
        int formattedYear = Integer.parseInt(formatBirthday[2]);

        int birthdaySum = formattedDay + formattedMonth + formattedYear;

        String specialChar = "-";
//        soluzione A
//        int birthdaySum = day + month + year;

        String password = name + specialChar + familyName + specialChar + color + specialChar + birthdaySum;

        System.out.println("Your new password is " + password);

        scan.close();
    }
}
