package com.company;

import java.util.Scanner; // This is the package name

public class Main {

    public static void main(String[] args) {
	// declare varriables
        double priceOfCoffee = 1.25;
        double taxRate = 1.15;



        // welcome message
        System.out.println("Welcome to the Coffee Shop!");

        // Inputs
        Scanner scannerName = new Scanner(System.in);
        System.out.print("Enter the number of cups: ");
        int numOfCups = scannerName.nextInt();
        scannerName.nextLine();

        System.out.print("What's your name? ");
        String custName = scannerName.nextLine();

        // scannerName is the object that is created from the scanner class
        //The object is made from the class


        System.out.println("The number of cups is: "+numOfCups);

        // Caclulations
        double preTaxTotal = numOfCups * priceOfCoffee ;
        double afterTaxTotal = preTaxTotal * taxRate;


        System.out.printf("Your pre tax total is: $ %.2f\n",preTaxTotal);
        System.out.printf("Your after Tax Total is: $ %.2f\n",afterTaxTotal);
        System.out.println("Thank you " + custName);

    }
}
