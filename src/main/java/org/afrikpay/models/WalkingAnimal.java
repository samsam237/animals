package org.afrikpay.models;

public class WalkingAnimal extends Animal{
    public WalkingAnimal(String name) {
        super (name);
    }

    public void moveTo (String place){
        System.out.println("The Walking Animal "+this.getName()+" is moving to "+place);
    }
}
