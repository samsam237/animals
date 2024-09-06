package org.afrikpay.models;

import org.afrikpay.interfaces.AnimalsInterface;

public class Animal implements AnimalsInterface {
    private String name;

    public Animal (String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void moveTo (String place){
        System.out.println("The Animal "+this.getName()+" is moving to "+place);
    }
}
