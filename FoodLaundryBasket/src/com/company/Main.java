package com.company;

public class Main {

    public static void main(String[] args) {

        //Food[] refrigerator = new Food[3];

        Food food1 = new Food("Apple");
        Food food2 = new Food("Pineapple");
        Food food3 = new Food("Dragon Fruit");

        Food[] Basket = {food1,food2,food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(Basket[0].name);
        System.out.println(Basket[1].name);
        System.out.println(Basket[2].name);
    }
}
