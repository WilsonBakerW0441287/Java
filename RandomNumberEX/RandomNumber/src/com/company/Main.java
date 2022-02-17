package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Character Entry");
        System.out.println("=".repeat(30));
        System.out.println("Enter one character");
        char key = sc.next().toCharArray()[0];
        System.out.println("The entered character is "+ key);
        System.out.println("Pres newLine to continue");
        sc.nextLine();//to handle the previous new line Charcter
        sc.nextLine();
        System.out.println("=".repeat(30));
        System.out.println("Random Numbers");
        System.out.println(Math.random()); // Math.random() returns value between 0 and 1.
        // Random number that is never more than $100000
        double randomNumber = Math.random() * 100000;
        System.out.println("The random number is : "+ randomNumber);
        // There is a problem in the next line, please fix it
        System.out.printf("The random number is : $% .2f "+ Math.random() * 100000);
        //The soultion is just: using another charcter instead of +
    }
}
