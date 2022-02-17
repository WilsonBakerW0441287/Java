package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your city");
        String cityName = sc.nextLine();
        if (cityName == "Halifax")
            System.out.println("From NS");
        else
            System.out.println("Another province");

        if (cityName.equals("Halifax"))
            System.out.println("From NS");
        else
            System.out.println("Another province");
    }
}
