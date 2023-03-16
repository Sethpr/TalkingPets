package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    ArrayList<Pet> pets = new ArrayList();
    public static void main(String[] args){
        new MainApplication().run();
    }

    public void run(){
        petAsk();
    }

    public void petAsk(){
        Scanner in = new Scanner(System.in);
        System.out.print("How many pets do you have: ");
        Integer numPets = in.nextInt();
        String petName;
        String petType;

        while(numPets>0){
            System.out.print("\nWhat type of pet do you want to add: ");
            petType = in.next().toLowerCase().trim();
            System.out.printf("\nWhat is your %s's name: ", petType);
            petName = in.next();
            if(adder(petType, petName)){
                numPets--;
            }
            in.nextLine();
        }

        System.out.println("\nHere is your list of pets:");

        for(Pet p : pets){
            System.out.print(p.name);
            System.out.print(": ");
            System.out.println(p.speak());
        }
    }

    public boolean adder(String type, String name){
        switch(type){
            case "bird":
                pets.add(new Bird(name));
                return true;
            case "cat":
                pets.add(new Cat(name));
                return true;
            case "dog":
                pets.add(new Dog(name));
                return true;
            default:
                System.out.println("please enter a valid pet type");
                return false;
        }
    }

}
