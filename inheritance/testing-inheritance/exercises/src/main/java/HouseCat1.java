

public class HouseCat1 extends Cat1 {
    private String name;
    private String species = "Felis catus";

    public HouseCat1(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat1(String aName){
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return super.noise() + " Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}