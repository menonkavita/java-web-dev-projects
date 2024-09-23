package org.launchcode;

public class Main {

    public static void main(String [] args){
        HouseCat polly = new HouseCat("Polly", 12);
        polly.eat();
        System.out.println("Is Polly tired? " + polly.isTired());

        Cat rocky = new Cat(9);
        System.out.println("\nRocky says " + rocky.noise());


        HouseCat mittens = new HouseCat("Mittens");
        System.out.println("\n" + mittens.noise() + "\n"
                + "I weigh " + mittens.getWeight() + " lbs");

        // Check your understanding:
        // Ans: #1
        Message hello = new Greeting("English", "Hello Coder!");
        System.out.println(((Greeting) hello).wave());
    }

}
