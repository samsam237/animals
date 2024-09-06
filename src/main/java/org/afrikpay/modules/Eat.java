package org.afrikpay.modules;

import org.afrikpay.interfaces.AnimalsInterface;
import org.afrikpay.interfaces.EatInterface;

public class Eat implements EatInterface {
    public static void eat(AnimalsInterface animal, String food) {
        System.out.println("The animal "+ animal.getName() + " is eating " + food);
    }
}
