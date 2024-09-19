package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());

        carStats(car);

        car.drive(501);
        carStats(car);
        car.addGas(7);
        carStats(car);
        car.drive(250);
        carStats(car);

        car.addGas(7.5);
        carStats(car);
    }

    public static void carStats(Car carObj){
        System.out.println("\nGas in Tank:                      " + carObj.getGasTankLevel()  + "\n" +
                "Total Gas that can be in the Tank: " + carObj.getGasTankSize()  + "\n" +
                "Odometer (Number of miles covered): " + carObj.getOdometer() + "\n");
    }
}