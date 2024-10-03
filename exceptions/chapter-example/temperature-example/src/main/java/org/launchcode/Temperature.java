package org.launchcode;

// Chapter Example
public class Temperature {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            try{
                throw new TemperatureException("Number cannot be less than Absolute Zero Fahrenheit of -459.67");
            }
            catch(TemperatureException t) {
                System.out.println("Value is below absolute zero");
                t.printStackTrace();
            }
        }
        fahrenheit = aFahrenheit;
    }
}
