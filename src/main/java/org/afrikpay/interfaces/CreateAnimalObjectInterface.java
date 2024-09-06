package org.afrikpay.interfaces;

import org.afrikpay.models.Animal;

public interface CreateAnimalObjectInterface {
    public static Animal createAnimalObjectByClassName (String className, String AnimalName) throws Exception{
        Class<?> clazz = Class.forName(className);

        return (Animal) clazz.getConstructor(String.class).newInstance(AnimalName);
    }
}
