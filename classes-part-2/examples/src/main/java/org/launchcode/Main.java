package org.launchcode;

import org.launchcode.Pet;


public class Main {

    public static void main(String [] args){
        String firstPet = "Fluffy";
        Pet secondPet = new Pet("Fluffy");
        Pet thirdPet = new Pet("Fluffy");

        if (thirdPet.equals(secondPet)){
            System.out.println("Option 3 returned true");
        }
        else{
            System.out.println("False");
        }
    }
}
