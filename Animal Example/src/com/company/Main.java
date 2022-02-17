package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	// pt1
//        Animal myDog = new Animal();
//        Animal myCow = new Animal("Cow", 300, "Farm", false);
//       //Animal myCat = new Animal("cat", 30, "Home", false);
//        Animal myLion = new Animal("Lion", 1000, "Jungle", true);
//       // System.out.println(myCat);
//        System.out.println(myLion.toString());
//
//        ArrayList<Animal> animalList = new ArrayList<>();
//       // animalList.add(myCat);
//        animalList.add(myCow);
//        animalList.add(myLion);
//        animalList.add(myDog);
//        System.out.println("from Foreach");
//        for (Animal myAnimal : animalList) {
//            System.out.println( myAnimal.feedAnimal());
//            System.out.println( myAnimal.makesound());
//            System.out.println(myAnimal.toString());
//        }
//        pt2
        cat myCat = new cat("Cat", 30, "home", false, 2);
        System.out.println(myCat.makeSound());
        System.out.println(myCat.toString());
        Cow myCow = new Cow("Cow", 1500, "Farm", false, 4);

        System.out.println(myCow.makeSound());
        System.out.println(myCow.toString());
        System.out.println(myCow.feedAnimal("grass"));

//      pt3
        //arraylist of animals
        Animal myPython = new Animal("dog", 150, "habitat", false);
        Animal myMouse = new Animal("Mouse", 15, "desk", false);
        Animal myKeyboard = new Animal("Keyboard", 10, "desk", false);

        ArrayList<Animal> tools = new ArrayList<>();
        tools.add(myMouse);
        tools.add(myKeyboard);
        tools.add(myPython);
        //for each
        for (Animal myAnimal : tools) {
            System.out.println(myAnimal.toString());
        }

        Animal[] Coding = {myPython, myMouse, myKeyboard};
        System.out.println(Coding[0].toString());
        System.out.println(Coding[1].toString());
        System.out.println(Coding[2].toString());


    }

}
