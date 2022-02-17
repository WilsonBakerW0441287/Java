package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //Delcare myArray - One Dim Array
//        int[] myArray = new int[5];
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print("Enter element # " + (i+1) + "\t : ");
//            myArray[i] = sc.nextInt();
//        }
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
        //Delcare stMark array
//        double[] stMark = {99,78,55,60,100};
//        System.out.println("The size of stMark is"+stMark.length);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(stMark[i]);
//        }
        double[] stMark = new double[5];
        for (int i = 0; i < stMark.length; i++) {
            System.out.print("Enter element # " + (i+1) + "\t : ");
            stMark[i] = sc.nextDouble();
        }
        //Find the maximum value of studets' marks
        double maxValue = stMark[0];
        for (int i = 1; i < stMark.length; i++) {
            if (stMark[i]>maxValue)
                maxValue =stMark[i];
        }
        System.out.println("The highest mark is : "+maxValue);
    }
}
