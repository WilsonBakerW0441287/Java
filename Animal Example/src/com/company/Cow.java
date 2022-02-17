package com.company;

public class Cow extends Animal{

    private int UtterCount;
//super. calls directly to the parent class
    //this. refers to the curent class

    public Cow(String pSpecies, double pMaxWeight, String pHabitat, boolean pIsEndangered, int pUtterCount){
        super(pSpecies, pMaxWeight, pHabitat, pIsEndangered);
        this.UtterCount =pUtterCount;

    }

    public String makeSound(){
        return String.format("A %s can make a MOO sound!",this.getSpecies());

    }
    public String toString(){
        return super.toString() + String.format(". This cow has %d utters",UtterCount);
    }

    public String feedAnimal(String food) {

        return String.format("You can Feed the %s A %s!",super.getSpecies(),food);
    }
}
