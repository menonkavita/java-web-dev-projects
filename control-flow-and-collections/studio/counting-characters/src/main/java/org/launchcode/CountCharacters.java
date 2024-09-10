package org.launchcode;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;


public class CountCharacters {

    public static void main(String[] args) {


//        String strPhrase = "Hello World";
//        String strPhrase = "If the product of two terms is zero then common sense says at least one of the two terms has " +
//                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into " +
//                "a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s " +
//                "pretty straightforward from there.";

        HashMap<Character, Integer> charactersHashList = new HashMap<>();

        // Bonus Mission #1: Getting input from user.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string or phrase.");                        // B.M #1 : -- getting string from user.
        String strPhrase= input.nextLine();
        input.close();


//       strPhrase = strPhrase.replaceAll("[^A-Za-z]", "");                           // B.M #3 : -- excluding all non-alphabetic characters.

        char[] charactersInString = strPhrase.toCharArray();
//        char[] charactersInString = strPhrase.toLowerCase().toCharArray();           // B.M #2 : -- to make the count case in-sensitive.
        System.out.println(charactersInString);

        for (char c : charactersInString) {
//            System.out.println(c);

            // -- Works
            if (charactersHashList.containsKey(c)) {
//            if (Character.isLetter(c)) {                                  // saves only alphabets into the HashMap; Null Pointer Exception
                charactersHashList.put(c, charactersHashList.get(c) + 1);
            } else {
                    charactersHashList.put(c, 1);
            }
        }

        System.out.println("Characters and a count of the number of times they occur in: ");
        System.out.println(strPhrase);

        for (Map.Entry<Character, Integer> c : charactersHashList.entrySet()) {
            System.out.println(c.getKey() + " : " + c.getValue());
        }
    }
}

