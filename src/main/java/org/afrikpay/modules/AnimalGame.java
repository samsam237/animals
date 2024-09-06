package org.afrikpay.modules;

import com.fasterxml.jackson.core.type.TypeReference;
import org.afrikpay.interfaces.AnimalGameInterface;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.afrikpay.interfaces.CreateAnimalObjectInterface;
import org.afrikpay.interfaces.GetUserIntInterface;
import org.afrikpay.interfaces.GetUserStringInterface;
import org.afrikpay.models.Animal;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.afrikpay.models.*;

public class AnimalGame implements GetUserStringInterface, AnimalGameInterface, GetUserIntInterface, CreateAnimalObjectInterface {

    public static Animal createAnimal () throws Exception{

        String currentDir = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentDir);

        ObjectMapper objectMapper = new ObjectMapper();

        ArrayList<String> animalCategories = objectMapper.readValue(new File("./conf/AnimalCategories.json"), new TypeReference<ArrayList<String>>() {});

        HashMap<String, String> categoriesToClasses = objectMapper.readValue(new File("./conf/CategorieToClass.json"), new TypeReference<HashMap<String, String>>() {});

        printMenuAnimal(animalCategories);
        int userChoice = GetUserIntInterface.getUserChoice();

        System.out.println("Give a name ");
        String animalName = GetUserStringInterface.getUserChoice();

        return CreateAnimalObjectInterface.createAnimalObjectByClassName ( "org.afrikpay.models." + categoriesToClasses.get ( animalCategories.get(userChoice) ) , animalName );
    }

    public static void printMenuAnimal (ArrayList<String> animalTypes){
        int i = 0;
        for (String animalType : animalTypes){
            System.out.println(i + "- " + animalType);
            i++;
        }
    };

}