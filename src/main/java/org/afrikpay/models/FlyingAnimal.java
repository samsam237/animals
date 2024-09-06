package org.afrikpay.models;

public class FlyingAnimal extends Animal {
    public FlyingAnimal(String name) {
        super (name);
    }

    public void moveTo (String place){
        System.out.println("The Flying Animal "+this.getName()+" is moving to "+place);
    }
}
