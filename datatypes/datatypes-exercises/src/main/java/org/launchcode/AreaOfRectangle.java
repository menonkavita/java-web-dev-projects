package org.launchcode;
import java.util.Scanner;


public class AreaOfRectangle {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the length of the Rectangle");
        int length = input.nextInt();

        System.out.println("Enter a number for the width of the Rectangle");
        int width = input.nextInt();
        input.close();

        int areaRectangle = length * width;
        System.out.println("Area of the Rectangle is: " + areaRectangle);


    }
}
