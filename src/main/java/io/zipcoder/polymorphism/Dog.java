package io.zipcoder.polymorphism;

public class Dog extends Pet{


    public Dog(String name) {
        this.name = name;
    }

    public String speak() {
        return "Bark";
    }
}
