import java.util.Scanner;


public class Area {

    public static void main(String [] args){
        System.out.println("Enter radius of the circle to calculate its area.");

        Scanner input =new Scanner(System.in);
        double radius = input.nextDouble();

        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is " + area);


    }
}
