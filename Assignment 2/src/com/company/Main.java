package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int goals ;
        String input;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Team Name:");
            while (!sc.hasNextLine()) { //While the scanner has no next line
                System.out.println("Please enter a valid word!");
                sc.next();
            }
            input = sc.nextLine();
        } while (input == null || input.equals(""));

        do {
            System.out.println("Enter number of goals: ");
            while (!sc.hasNextInt()) { //Check that the value is an integer
                System.out.println("Enter a positive integer number.");
                sc.next();
            }
            goals = sc.nextInt();
        } while (goals < 0);

        int assists;
        do {
            System.out.println("Enter number of assists: ");
            while (!sc.hasNextInt()) { //Check that the value is an integer
                System.out.println("Enter a positive integer number.");
                sc.next();
            }
            assists = sc.nextInt();
        } while (assists < 0);





        //if(xyz){
        System.out.println("CLASS A – the total goals and assists is greater than 30");
        //} elseif
        System.out.println("CLASS B – the total goals and assists is greater than or equal to 20 AND less than 30"
        );
        //elseif
        System.out.println("CLASS C – the total goals and assists is greater than zero AND less than 20"
        );
        //elseif
        System.out.println("CLASS D – the total goals and assists is zero");
        //STATS PER PLAYER

    }
}
