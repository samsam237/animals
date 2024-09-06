package org.afrikpay.modules;

import org.afrikpay.interfaces.GameInterface;
import org.afrikpay.interfaces.GetUserIntInterface;
import org.afrikpay.interfaces.GetUserStringInterface;
import org.afrikpay.models.Animal;

import java.util.Map;
import java.util.HashMap;

public class Game implements GameInterface, GetUserIntInterface {
    static Map<String, Animal> animals = new HashMap<>();

    public static void printMenu(){
        System.out.println("################################");
        System.out.println("\nMenu");
        System.out.println("1. List of animals");
        System.out.println("2. Add a new animal");
        System.out.println("3. Delete an animal");
        System.out.println("4. Get an animal");
        System.out.println("0. Exit");
        System.out.println("################################");
    }

    public static void makeDecision(int value) throws Exception {
        switch (value){
            case 1:
                for (Animal animal : animals.values()) {
                    System.out.println(animal.getName());
                }
                break;
            case 2:
                Animal animal = AnimalGame.createAnimal();
                animals.put (animal.getName(), animal);
                break;
            case 3:
                System.out.println("name of the animal to removed");
                String animalToRemoveName = GetUserStringInterface.getUserChoice();

                Animal removedObject = animals.remove(animalToRemoveName);

                removedObject = null;
                System.gc();
                break;

            case 4:
                System.out.println("name of the animal to get");
                String animalToGetName = GetUserStringInterface.getUserChoice();
                Animal animalToGet = animals.get(animalToGetName);
                if (animalToGet != null) {
                    System.out.println("Give me the name of the food");
                    String foodToGetName = GetUserStringInterface.getUserChoice();
                    Eat.eat(animalToGet, foodToGetName);
                }
            default:
                throw new Exception();
        }
    };

    public static void play() {

        while(true) {
            System.out.println("Game started");
            try{
                Game.printMenu();
                Game.makeDecision(GetUserIntInterface.getUserChoice());
            } catch (Exception e) {
                System.out.println("END");
                break;
            }

        }
    }
}