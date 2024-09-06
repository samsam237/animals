package org.afrikpay.models;

public class SwimmingAnimal extends Animal {
    public SwimmingAnimal(String name) {
        super (name);
    }

    public void moveTo (String place){
        System.out.println("The Swimming Animal "+this.getName()+" is moving to "+place);
    }
}
