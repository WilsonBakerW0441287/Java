package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        Car myCars[] = new Car[0];
        //Instantiate the Car class (Creating a new object of Car class)
//        Car myCar = new Car();
//        myCar.color = "Red";
//        System.out.println("My car's colur is : "+ myCar.color);
//        myCar.turnRight(); // I am calling the void method
//        Car yourCar = new Car();
//        yourCar.color = "Blue";
        Car myToyotaCar = new Car();
        //System.out.println("My car is ");
        //System.out.println(myToyotaCar.color+"\t"+myToyotaCar.carMake+"\t"+myToyotaCar.manufYear);
        //loop
        System.out.print("What colour is the car: ");
        String colour = input.nextLine();
        System.out.print("What is the make: ");
        String carmake = input.nextLine();
        System.out.print("What is the manufacturing year: ");
        int manufyear = input.nextInt();
        input.nextLine();
        System.out.print("is the car automatic Y/N?: ");
        String yesno = input.nextLine();
        yesno = yesno.toUpperCase(Locale.ROOT);
        boolean isautomatic;
        if (yesno == "Y") {
            isautomatic = true;
        } else {
            isautomatic = false;
        }

        System.out.println("What was the car's price before tax: ");
        int pbt = input.nextInt();

        input.nextLine();

        Car myNewCar = new Car();

        myNewCar.setPriceOfCar(pbt);

        myNewCar = new Car(colour, carmake, manufyear, isautomatic);
//used to be myHondaCar
        //System.out.print("Enter the Car Make: ");
        //myHondaCar.carMake = sc.nextLine();
        //       System.out.println("the Users car: ");
//        myHondaCar.reportOne();
//        System.out.println(myHondaCar.carMake);
//          myHondaCar.reportTwo();
//        myHondaCar.turnRight();
//        myToyotaCar.turnRight();

        System.out.println(myNewCar.finalreport());
        Car myFord = new Car("BMW","White",2019,true);
        myFord.reportTwo();

        //System.out.println(myCar.turnRight());

        myCars[2] = myToyotaCar;
        myCars[1] = myFord;
        myCars[0] = myNewCar;
        for (int i = 0; i < myCars.length; i++) {
            myCars[i].finalreport();
        }
    }
}
