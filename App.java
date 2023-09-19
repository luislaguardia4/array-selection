// you can find the comments / notes of the programmer on the bottom

// Laboratory Activity 3: Array

// instructionss:
//Write a program using Array that would display a menu of items of your choice.
//Your program may ask for user's input. As a challenge, you may ask the user to repeat his/her input.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        System.out.println("WELCOME TO YOUR DREAM");

        Scanner sc  = new Scanner(System.in);
        
        String[] bar = {"Xylo", "Casa Blanca", "Lynx", "Pop up", "Bolt Hole"};
        String[] alak = {"Tequila", "Whiskey", "Vodka", "Beer", "Wine", "Champagne problems"};
        String[] hotel = {"Sogo", "Seda", "Cosmo", "Red Doorz"};

        boolean select = true;

        while (select) {
            System.out.print("SELECT ONE: ('Bar', 'Alak', 'Hotel') type 'close' to close: ");
            String fromUser = sc.nextLine();

            switch (fromUser.toLowerCase()) {
                case "bar":
                    System.out.println("\n you selected Bar array. MENU: \n");
                    for (String selected : bar) {
                        System.out.println("- " + selected + "\n");
                    }
                    break;
                case "alak":
                    System.out.println("\n you selected Alak array. MENU: \n ");
                    for (String selected : alak) {
                        System.out.println("- " + selected + "\n");
                    }
                    break;
                case "hotel":
                    System.out.println("\n you selected Hotel array. MENU: \n");
                    for (String selected : hotel) {
                        System.out.println("- " + selected + "\n");
                    }
                    break;
                case "close":
                    select = false;
                    break;
                default:
                    System.out.println("Invalid input. Please select one: 'Bar', 'Alak', 'Hotel', or 'exit'.");
                    break;
            }
        }

        System.out.println("** THANK YOU ! **");
        sc.close();
    }
}

// < === notes for the viewers === >
// the users input is convertede to lowercase because the switch case reads the variable in lower case; "bar", "alak", hotel
// the control structure is in while to anda i putted the "close" option in switch case to stop program asking to select again
// scanner name is "sc" in general for "scanner"
// the "default" set in the switch case is for the invalid input,, if the user didnt input the specified 
// variable of the array "bar", "alak", and "hotel".

// Luis Gabriel H. LAGUARDIA - INF 227 :>
