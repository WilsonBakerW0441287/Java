package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        Display a welcome message
//        Calculate shipping charges for a shopper
//        Ask the user to enter the amount for their total purchase
//        If their total is under $50 add $10, otherwise shipping is free
//        Tell the user their final total including shipping
//        proper currency formatting or rounding.
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the fastest food in the east!");
        System.out.print("how many Orders would you like (how many times will I ask for shipping total): ");
        int i = sc.nextInt();
        int j = 0;
        do {
            System.out.println(j+1);
            System.out.print("How much was your order total: $");
            double shipCost = sc.nextInt();
            int shipRate = 10;

            if (shipCost > 50) {
                System.out.printf("You have qualified for free shipping your total is: $ %.2f\n", shipCost);
            }
            else if (shipCost < 50) {
                double shipFinalCost = shipCost + shipRate;
                System.out.printf("You do not qualify for free shipping your total is: $ %.2f\n", shipFinalCost);
            }
            else {
                System.out.println("oh no!");
            }
            j++;
        } while (j < i);
    }
}
