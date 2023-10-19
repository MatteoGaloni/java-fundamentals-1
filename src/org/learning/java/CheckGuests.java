package org.learning.java;

import java.util.Scanner;

public class CheckGuests {
    public static void main(String[] args) {
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner scan = new Scanner(System.in);
        System.out.println("What's you name? ");
        String guestName = scan.nextLine();

        boolean isAuthorized = false;
//        add counter in order to use while loop
        int i = 0;

//        for (int i = 0; i < guests.length ; i++) {
//     if (guestName.equals(guests[i])){
//         isAuthorized = true;
//         System.out.println("trovato");
//     }
// }
        while(i < guests.length && !isAuthorized) {
            if (guestName.equals(guests[i])){
                isAuthorized = true;
            }
            i++;
        }

//        if (isAuthorized){
//            System.out.println("Please Welcome");
//        } else {
//            System.out.println("Sorry, you are not allowed to enter");
//        }

//        Shorter solution
        System.out.println(isAuthorized ? "Please Welcome" : "Sorry, you are not allowed to enter");


            scan.close();
    }
}
