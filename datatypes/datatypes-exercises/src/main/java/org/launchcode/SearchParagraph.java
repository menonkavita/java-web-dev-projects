package org.launchcode;
import java.util.Scanner;

public class SearchParagraph {
    public static void main(String [] args){

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                          "and of having nothing to do: once or twice she had peeped into the book her " +
                          "sister was reading, but it had no pictures or conversations in it, 'and what " +
                          "is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Find below the first sentence from the book - Alice in Wonderland");
        System.out.println(sentence);

        String yesOrNo="y";
        Scanner input = null;

        while(yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Enter a word that you will like to search for in the sentence");
            input = new Scanner(System.in);
            String searchWord=input.next();

            if (sentence.toLowerCase().contains(searchWord.toLowerCase())){
                System.out.println(searchWord + " is present in the above sentence.");
            }
            else{
                System.out.println(searchWord + " is not present in the above sentence.");
            }

            sentence = replaceSearchWord(searchWord, sentence);
            System.out.println(sentence);

            System.out.println("Would you like to search for another word? Enter y or n");
            yesOrNo= input.next();
        }
        input.close();
    }

    // Exercise E: Strings
    public static String replaceSearchWord(String search, String firstSentence){

        int index = firstSentence.indexOf(search);
        int length = search.length();
        System.out.println("Your search word '" + search + "' is the " + index + "th character in the sentence.");
        System.out.println("Length of your search word is: " + length + " characters long.");

        String modifiedSentence = firstSentence.replace(search, "bonkers");
        System.out.println("The sentence without the search word is: ");
//        System.out.println(modifiedSentence);

        return modifiedSentence;

    }
}
