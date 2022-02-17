package com.company;

public class Car2 {
    //1. Propertirs/Attributes
    //Using private means you encapsulate those properties === Encapsulation
    private String color;
    private String carMake; // Protected
    private int manufYear;
    private boolean isAutomatic;
    private double priceBeforeTax;
    //2. The constructor of this class, could be:
    //A. The default constructor
    //B. User defined constructor without parameters
//    public Car(){ 
//        this.color = "Red";
//        this.carMake = "Toyota";
//        this.manufYear = 2009;
//    } 
    public void Car3(){
        this.color = "Red";
        this.carMake = "Toyota";
        this.setManufYear(2009);
    } 
    //C. User defined constructor with parameters
    public void Car2(String color,String carMake,int manufYear,boolean isAutomatic){
        this.color = color;
        this.carMake=carMake;
        this.setManufYear(manufYear);
        this.setAutomatic(isAutomatic);
    } 
    public void Car5(String color, String carMake, int manufYear, boolean isAutomatic, double pPriceBeforeTax){
        this.color = color;
        this.carMake=carMake;
        this.setManufYear(manufYear);
        this.setAutomatic(isAutomatic);
        this.priceBeforeTax = pPriceBeforeTax;
    } 
    //The setter method for priceOaxProperty
    public void setPriceBeforeTax(double priceBeforeTax) { 
        this.priceBeforeTax = priceBeforeTax;
    } 
    //Gette - returning or getting the value of the attribute to another class
    public double getPriceBeforeTax() { 
        return priceBeforeTax;
    } 
    //3.Actions(Methods)(Behaviours)
    public void turnRight(){ 
        System.out.println("Turned Right!");
    } 
    public void reportOne(){ 
        System.out.println(color+"\t"+carMake+"\t"+ getManufYear());
    } 
    public void reportTwo(){ 
        System.out.println(this.color+"\t"+this.carMake+"\t"+ this.getManufYear() +
                "\t"+ this.isAutomatic() +"\t"+this.priceBeforeTax);
    } 
    String finalReport(){  // It is considered as Protected
        String report= String.format("Car's Make: %S, Car's Color : %S, Manufacturing Year: %d, Transmission : %b",
                this.carMake,this.color, this.getManufYear(), this.isAutomatic());
        return report;
    } 
    double priceAfterTax(){ 
        double priceAfTax = this.priceBeforeTax*1.15;
        return priceAfTax;
    } 
    public int getManufYear() { 
        return manufYear;
    } 
    public void setManufYear(int manufYear) { 
        this.manufYear = manufYear;
    } 
    public boolean isAutomatic() { 
        return isAutomatic;
    } 
    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}
