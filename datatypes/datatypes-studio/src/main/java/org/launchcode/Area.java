package org.launchcode;
import java.util.Scanner;
import org.launchcode.Circle;


public class Area {

    public static void main(String [] args){

        // Bonus Missions:
        // 1. Add validation to your program. If the user enters a negative number? a non-numeric character? the empty string?
        // Print an error message and quit. You’ll need to peek ahead to learn about conditional syntax in Java.

        // 2. Extend your program further by using a while or do-while loop , so that when the user enters a negative number
        // they are re-prompted.

        Scanner input = new Scanner(System.in);
        String userChoice = "";

        do{
//          Scanner input = new Scanner(System.in);
            System.out.println("Enter radius of the circle to calculate its area.");

            if(input.hasNextDouble())
            {
            /*
             Double radius = Double.parseDouble(userInput);
             double radius = input.nextDouble();
             double area = 3.14 * radius * radius;
            */

            double radius = input.nextDouble();

                if (radius >= 0){
                    double area = Circle.getArea(radius);
                    System.out.println("The area of the circle with radius " + radius + " is " + area);

                }
                else{
                    System.out.println("Negative number entered. Please enter positive values only.");
                }
            }
            else{
                System.out.println("Incorrect value entered. Exiting.");
                input.close();
                return;
            }

            System.out.println("Would you like to find the area of another number? Answer 'y' if you would like to continue.");
            userChoice = input.next();

        } while(userChoice.equalsIgnoreCase("y"));

        input.close();
    }
}
