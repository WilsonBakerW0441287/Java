package com.company;
//  Wilson Baker
//  EX2 Grade calculator
//  24/01/22

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Delcare and initalize the lists
        int[] numGrade = {0, 1, 2, 3, 4};
        String[] letterGrade = {"F", "D", "C", "B", "A"};


        //scanner to gather inputs
        Scanner input = new Scanner(System.in);
        //While loop to ask the question
        boolean a = true;
        do {
            System.out.println("Grade converter V2.0 is here!");
            System.out.print("Enter your LETTER grade: ");
            String studentGrade = input.nextLine();
            String compareGrade = "F";
            for (int i = 0; i < letterGrade.length; i++) {
                int idxNumGrade = numGrade[i];
                String idxLetterGrade = letterGrade[i];
                ///BUllshit .equals shenanigans
                if (idxLetterGrade.equals(studentGrade)) {
                    System.out.println("Your NUMERICAL grade is " + idxNumGrade);
                    i = 5;
                }
            }
            System.out.println("Do you wish to exit Y/N: ");
            String exit = input.nextLine();
            if (exit == "N") {
                a = false;
            } else
                a = true;

        } while (a = true);


    }
}

