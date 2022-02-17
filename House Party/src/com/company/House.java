package com.company;

public class House {
    //Properties and attributes

    private int length;
    private int width;
    private String decor;
    private int floors;
    String getDecor() {
        return decor;
    }

    public void setDecor(String decor) {
        this.decor = decor;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public House(int length, int width, String decor,int floors){
    this.length = length;
    this.width = width;
    this.decor = decor;
    this.floors = floors;

    }

    public void printTotalArea(){
        float totalArea = this.length * this.width;
        System.out.println("The total area is "+totalArea);
    }

    public void asesment(){
        System.out.println(String.format("Decor Style: %S\n"+"# of floors: %d",this.decor, this.floors));
    }


}