package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListPractice {

    public static void main(String[] args) {

        /* #1 Write a static method to find the sum of all the even numbers in an ArrayList. Within main,
        create a list with at least 10 integers and call your method on the list.
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (int j : numbers) {
            System.out.println(j);
        } // Prints all numbers in the array

        int totalEvenNumbers = sumEvenNumbers(numbers);
        System.out.println("Sum of all Even numbers in the array is: " + totalEvenNumbers);

        /* #2 Write a static method to print out each word in a list that has exactly 5 letters.
         */

        ArrayList<String> strWords = new ArrayList<>();
        strWords.add("Mercury");
        strWords.add("Venus");
        strWords.add("Earth");
        strWords.add("Mars");
        strWords.add("Jupiter");
        strWords.add("Saturn");
        strWords.add("Uranus");
        strWords.add("Neptune");

        for(String str : strWords){
            if (str.length() == 5){
                System.out.println("Words that have exactly 5 letters are: " + str);
            }
        }

        System.out.println("Please enter the length of the word to search ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        for(String str : strWords){
            if (str.length() == length){
                System.out.println("Words that have exactly " + length +" letters are: " + str);
            }
        }

    } // end of main()

    public static int sumEvenNumbers(ArrayList<Integer> numArray) {
        int sum = 0;

        for (int j : numArray) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }  // end sumEvenNumbers


}
