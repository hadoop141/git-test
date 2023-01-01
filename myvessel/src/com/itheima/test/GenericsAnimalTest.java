package com.itheima.test;

import java.util.ArrayList;

public class GenericsAnimalTest {
    public static void main(String[] args) {
        ArrayList<LiCat> list1 = new ArrayList<>();
        ArrayList<BossCat> list2 = new ArrayList<>();
        ArrayList<TeDiDog> list3 = new ArrayList<>();
        ArrayList<HaShiQi> list4 = new ArrayList<>();

        keepPet(list1);
        keepPet(list2);
        keepPet(list3);
        keepPet(list4);



    }

    /*public static void keepPet(ArrayList<? extends Cat> list){
        for (Cat cat : list) {
            cat.eat();
        }
    }*/

    /*public static void keepPet(ArrayList<? extends Dog> list){
        for (Dog dog : list) {
            dog.eat();
        }
    }*/

    public static void keepPet(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
