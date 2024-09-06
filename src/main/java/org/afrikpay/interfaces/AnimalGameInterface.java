package org.afrikpay.interfaces;

import org.afrikpay.models.Animal;

import java.util.ArrayList;

public interface AnimalGameInterface {
    public static Animal createAnimal (){return new Animal("");};
    public static void printMenuAnimal (ArrayList<String> animalTypes){};
}
