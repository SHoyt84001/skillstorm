package com.skillstorm.tuesday2;

import java.util.Scanner;

public class robTennis {

    public static void main(String[] args) {
        System.out.println("Welcome to the program for deciding if you");
        System.out.println("Should Play Tennis Today\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's look at the weather conditions.\n");

        if (isWeatherGood(scanner)) {
            System.out.println("Yes! Today is a great day to play tennis.");
        } else {
            System.out.println("No, today is not good tennis weather. Maybe go bowling.");
        }
        scanner.close();
    }

    public static boolean isWeatherGood(Scanner scanner) {
    	
        String response = "null";
        System.out.print("Is it sunny? (yes or no)");
        response = scanner.nextLine();

        
        if (!response.equalsIgnoreCase("yes")) {
            System.out.println("Is it overcast? (yes or no)");
            response = scanner.nextLine();

            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Is there a strong wind? (yes or no)");
                response = scanner.nextLine();

                if (!response.equalsIgnoreCase("no")) {
                    return false;
                } 
                else return true;
            } else return true;
        } else {
            System.out.println("Is it humid? (yes or no) ");
            response = scanner.nextLine();

            // if strong wind: = bad weather
            if (!response.equalsIgnoreCase("no")) {
                return false; // high humidity
            } 
            else return true; // low humidity
            //end if
        }
        //end if
    }
}
