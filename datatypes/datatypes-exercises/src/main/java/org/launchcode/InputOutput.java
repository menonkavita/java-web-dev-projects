package org.launchcode;
import java.util.Scanner;


public class InputOutput {
    public static void main(String [] args)
    {
        System.out.println("Hello World!!");

        Scanner input = new Scanner(System.in);
        System.out.println("Hello there! Please enter your name:");

        String name = input.nextLine();
        input.close();
        System.out.println("Hi " + name + "! Welcome to the world of Java Programming!");
    }
}
