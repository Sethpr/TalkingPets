package io.zipcoder.polymorphism;

public class Bird extends Pet{


    public Bird(String name) {
        this.name = name;
    }

    public String speak() {
        return "Chirp chirp!";
    }
}
