package com.company;

public class Car {
    //1. Propertirs/Attributes
    private String color;
    private String  carMake;
    private int manufYear;
    private boolean isautomatic;
    private double priceOfCar;


    //2. The constructor of this class, could be:
    //A. The default constructor
    //B. User defined constructor without parameters
//    public Car(){
//        this.color = "Red";
//        this.carMake = "Toyota";
//        this.manufYear = 2009;
//    }
    public Car(){
        this.color = "Red";
        this.carMake = "Toyota";
        this.setManufYear(2009);
    }

    public Car(String color, String carMake, int manufYear, boolean isautomatic){
        this.color = color;
        this.carMake=carMake;
        this.setManufYear(manufYear);
        this.setIsautomatic(isautomatic);
        ;
    }
//getter
    public void setPriceOfCar(double priceOfCar) {
        this.priceOfCar = priceOfCar;
    }
//setter

    public double getPriceOfCar() {

        return priceOfCar;
    }

    //3.Actions(Methods)(Behaviours)

    public void turnRight(){
        System.out.println("Turned Right!");
    }
    public void reportOne(){
        System.out.println(this.color+"\t"+this.carMake+"\t"+ this.getManufYear());
    }
    public void reportTwo(){
        System.out.println(this.color+"\t"+this.carMake+"\t"+ this.getManufYear() +"\t"+ this.isIsautomatic() +"\t"+this.priceOfCar);
    }

    String finalreport(){
        String reports = String.format("Car's make: %S \n" +
                "Car's colour : %S \n" +
                "Car's manufacturing year : %d \n" +
                "Transmission : %b\n",this.carMake,this.color, this.getManufYear(), this.isIsautomatic());
        return reports;
    }
    double priceAfterTax(){
        double tax = 1.15;
        double priceAfterTax = this.priceOfCar * tax;

    return priceAfterTax;
    }

    public int getManufYear() {
        return manufYear;
    }

    public void setManufYear(int manufYear) {
        this.manufYear = manufYear;
    }

    public boolean isIsautomatic() {
        return isautomatic;
    }

    public void setIsautomatic(boolean isautomatic) {
        this.isautomatic = isautomatic;
    }
}
