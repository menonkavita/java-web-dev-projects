package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles driven: ");
        double miles = input.nextDouble();

        System.out.println("Enter the number of gallons consumed: ");
        double gallons = input.nextDouble();
        input.close();

        double milesPerGallon = miles/gallons;

        System.out.println("Amount of gallons per mile is: " + milesPerGallon + " mpg");

    }
}
