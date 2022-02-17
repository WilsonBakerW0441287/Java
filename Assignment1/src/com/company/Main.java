package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //part 1
        //initialize and delcare varriables with input if needed
        System.out.print("Enter the number of asterisks: \n");
        int k = input.nextInt();
        String l = "*";
        //we subtract 1 to because 0 is the first index spot
        //we subtract and use less than to make the triangle upsidedown
        for (int p = k - 1; p > 0; p--) {
            //This is the amount of "*" get printed on each row
            for (int a = 0; a < p; a++) {
                System.out.print(l);
            }
            System.out.println();
        }
        //This is the inverse of the first loop making a triangle from top to bottom
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(l);
            }
            System.out.println();
        }



        //part 2
        //declare and initalize variables
        double[] Grades = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int increment = 0;
        double temp = 0;
        double avg = 0;
        //max 100 bc I do the comparing silly
        double max = 100;
        double min = 0;
        //Ask for the marks with a loop
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Mark #" + (increment + 1) + ": ");
            double usergrade = input.nextDouble();
            Grades[i] = usergrade;
            increment++;
            //^ this is classic adding to the list
        }


        System.out.println("The Total Marks: ");
        for (int i = 0; i < Grades.length; i++) {
            temp = Grades[i];
            System.out.println("Mark #" + (i +1) + ": " + temp);
        }
        //This is a roundabout way of not using souf to print what we want
        //more classic loop printing

        //loop to find the average
        for (int i = 0; i < Grades.length; i++) {
            temp += Grades[i];
            avg = temp / Grades.length;
        }
        System.out.println("The Average: " + avg);

        //If statment that comnpares each value to see if its bigger than the last
        //if the number is smaller than the last > change it > repeat
        for (int i = 0; i < Grades.length; i++) {
            temp = Grades[i];
            if (max > temp) {
                max = temp;
            }
        }
        System.out.println("The Minimum Value: " + max);

        //If statement that compares each value to see if its smaller than the last
        for (int i = 0; i < Grades.length; i++) {
            temp = Grades[i];
            if (min < temp) {
                min = temp;
            }
        }
        System.out.println("The Maximum Value: " + min);

        //part 3
        int[][] myArray = {{10, 20, 30, 40},
                {12, 15, 18, 19},
                {10, 10, 10, 10}};
        int sum = 0;
        int entry = 0;
        //int avg = 0; // already made in scope
        System.out.println("\n\nWelcome To the 3rd Section!\nThe array Elements are:");
        //Sum of Row 1
        for (int i = 0; i < 3; i++) {// how many lists there are
            if (i == 0) {
                System.out.println(Arrays.deepToString(myArray));
            }
            for (int j = 0; j < 4; j++) { //how many entries in each list
                entry = (myArray[i][j]);//Gets me the actual item in the list
                sum += entry;
            }
            System.out.println("The Summation of Row #" + (i + 1) + " is: " + sum);
            sum = 0; // To clear the sum value, so we can add the last 3 rows
        }
        //Average
        for (int i = 0; i < 3; i++) {//how many lists are there
            for (int j = 0; j < 4; j++) { //how many entries in each list
                entry = (myArray[i][j]);//Gets me the actual item in the list
                sum += entry;
                int g =  myArray.length * myArray[0].length;
                avg = sum / g;
            }
        }
        System.out.println("The Average is: " + avg + "\n");


        System.out.println("The Converted Array Elements are:");
        for (int i = 0; i < 3; i++) {//how many different lists are there
            for (int j = 0; j < 4; j++) { //how many entries in each list
                System.out.println(myArray[i][j]);//Gets me the actual item in the list
            }
        }


    }
}