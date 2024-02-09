package com.example.practice1.expolymorphism;

public class Zoo {

    public static void main(String[] args) {

        // Animal[] animals = new Animal[5];

        // animals[0] = new Bear();
        // animals[1] = new Goat();
        // animals[2] = new Horse();
        // animals[3] = new Monkey();
        // animals[4] = new Sheep();

        Animal[] animals = { new Bear(), new Goat(), new Horse(), new Monkey(), new Sheep() };

        for (Animal animal : animals) {
            animal.cry();

        }
    }
}