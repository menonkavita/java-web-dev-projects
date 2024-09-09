package org.launchcode;


public class ArraysPractice {

    public static void main(String[] args){

        // Exercise #1
        int[] intArray = {1,1,2,3,5,8};

        for (int i:intArray){
            System.out.println(i);
        }

        // Exercise #2
        /* Use the split method to divide the string at each space and store the individual words in an array. */

        String strPhrase="I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] strWordsArray=  strPhrase.split(" ");
//        System.out.println(Arrays.toString(strWordsArray));

        for (String str : strWordsArray){
            System.out.println(str);
        }

        // Repeat same but  split the string into separate sentences.
        String[] strSentencesArray =strPhrase.split("\\.");
//        System.out.println(Arrays.toString(strSentencesArray));                       -- Red swiggly line

        for(String str : strSentencesArray){
            System.out.println(str);
        }

    }
}
