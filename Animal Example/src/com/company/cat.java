package com.company;

public class cat extends Animal{





    private int whiskersLength;


    public cat(String pSpecies, double pMaxWeight, String pHabitat, boolean pIsEndangered, int pwhiskersLength){
        super(pSpecies, pMaxWeight, pHabitat, pIsEndangered);
        this.whiskersLength =pwhiskersLength;

    }

    public String makeSound(){
        return String.format("A %s can make a Meow sound!",this.getSpecies());

    }
    public String toString(){
        return super.toString() + String.format(". Whisker lengthis %d CM",whiskersLength);
    }

}