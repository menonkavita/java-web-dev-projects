package org.launchcode;


public class Pet {

        private String name;

        Pet(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    public boolean equals(Object petToCheck) {
        System.out.println("public boolean equals()");

        if (petToCheck == this) {
            System.out.println("petToCheck == this");
            return true;
        }

        if (petToCheck == null) {
            System.out.println("petToCheck == null");
            return false;
        }

        if (petToCheck.getClass() != getClass()) {
            System.out.println("petToCheck.getClass() != getClass()");
            return false;
        }

        Pet thePet = (Pet) petToCheck;
        System.out.println("thePet.getName() " + thePet.getName() + " == " + " getName() " + getName());
        return thePet.getName() == getName();
    }

}
