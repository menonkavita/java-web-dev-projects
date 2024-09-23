

public class Main {

    public static void main(String [] args){
        HouseCat1 polly = new HouseCat1("Polly", 12);
        polly.eat();
        System.out.println("Is Polly tired? " + polly.isTired());

        Cat1 rocky = new Cat1(9);
        System.out.println("\nRocky says " + rocky.noise());


        HouseCat1 mittens = new HouseCat1("Mittens");
        System.out.println("\n" + mittens.noise() + "\n"
                + "I weigh " + mittens.getWeight() + " lbs");

        // Check your understanding:
        // Ans: #1
        Message hello = new Greeting("English", "Hello Coder!");
        System.out.println(((Greeting) hello).wave());
    }

}
