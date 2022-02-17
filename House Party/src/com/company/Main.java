package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here Length, width and at least two other properties (your choice).
        //– A method called printTotalArea(), which prints the total square footage of the
        //house to the console.
        //– Another method (your choice), that can simply print a description of its action to
        //the console.
        Scanner input = new Scanner(System.in);
        int length;
        int width;
        String decor;
        int floors;
        System.out.print("What is the width of the house: ");
        width = input.nextInt();
        input.nextLine();
        System.out.print("What is the length : ");
        length = input.nextInt();
        input.nextLine();
        System.out.print("What is the Decor Style: ");
        decor = input.nextLine();
        System.out.print("How many floors: ");
        floors = input.nextInt();
        input.nextLine();

    House h = new House(length,width,decor,floors);
    h.printTotalArea();
    h.asesment();

        
    }
}
