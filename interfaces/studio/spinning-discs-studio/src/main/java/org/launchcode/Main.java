package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cdObject = new CD("CD-1", "LC-CD", "Windows OS",  500, true);
        DVD dvdObject = new DVD("DVD-1", "LC-DVD", "Mac OS", 750);

        ArrayList<String> cdArrayList = new ArrayList<>();
        ArrayList<String> dvdArrayList = new ArrayList<>();

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cdObject.runFile();

        cdArrayList.add("We are the World.mp3");
        cdArrayList.add("Circle of Life -  Madagascar.mp3");
        cdArrayList.add("Believer - Imagine Dragons.mp3");
        cdObject.setFileNames(cdArrayList);

        System.out.println("\nCD info - ");
        System.out.println(cdObject + "\n" + cdObject.spinDisc());

        System.out.println("\nNumber of files in CD are: " + cdObject.getFileNames().size());
        System.out.println("Files in CD: ");
        for(int i =0; i < cdObject.getFileNames().size(); i++){
            System.out.println(cdObject.getFileNames().get(i));
        }


        // DVD part
        dvdObject.runFile();

        dvdArrayList.add("Black-Beauty.mp4");
        dvdArrayList.add("Pride&Prejudice.mp4");
        dvdArrayList.add("WearetheWorld.mp4");
        dvdArrayList.add("Jurassic-World.mp4");
        dvdArrayList.add("SpidermanReturns.mp4");
        dvdObject.setFileNames(dvdArrayList);

        System.out.println("\n\nDVD info - ");
        System.out.println(dvdObject + "\n" + dvdObject.spinDisc());
        System.out.println("\nNumber of files in CD are: " + dvdObject.getFileNames().size());
        System.out.println("Files in DVD: ");
        for(int i =0; i < dvdObject.getFileNames().size(); i++){
            System.out.println(dvdObject.getFileNames().get(i));
        }

    }
}