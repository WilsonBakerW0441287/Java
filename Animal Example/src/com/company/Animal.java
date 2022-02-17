package com.company;

public class Animal {
    //    Step1:
//    Define Animal Class with four properties:
//            1. Species -ex. Lion, cow or anything else.
//            2. Max Weight – The maximum average weight of an adult of the species.
//            3. Habitat – ex. Jungle, ocean, or mountain, … etc.
//4. Is Endangered- Flag to indicate whether the animal species is endangered.
    private String species;
    private double maxWeight;
    private String habitat;
    private boolean isEndangered;

    //    Step2:
//    Add a user defined constructor without parameters constructor,
//    with any default values that you feel be required.
    public Animal() {
        this.setSpecies("Dog");
        this.setMaxWeight(40);
        this.setHabitat("Home");
        this.setEndangered(false);
    }

    //    Step3:
//    Add a parametrized constructor to allow setting of all properties on object creation.
    public Animal(String pSpecies, double pMaxWeight, String pHabitat, boolean pIsEndangered) {
        this.setSpecies(pSpecies);
        this.setMaxWeight(pMaxWeight);
        this.setHabitat(pHabitat);
        this.setEndangered(pIsEndangered);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public String feedAnimal() {

        return "Feed a " + this.species + " a steak";
    }

    public String makeSound() {
        String noise = "ANIMAL NOISE";





        if (this.species == "cat") {
            noise = "Meow";
        } else if (this.species == "Lion") {
            noise = "ROAR";
        }
        return String.format("A %s make a %s sound",this.species,noise);
    }

    public String toString() {
        String animalStatus = "not an Endangered";
        if (this.isEndangered) {
            animalStatus = "an Endangered";
        }
        return String.format("I am a %.2f UNITS OF WEIGHT %s that lives in %s. I am %s species", this.maxWeight, this.species, this.habitat, animalStatus);
    }


}