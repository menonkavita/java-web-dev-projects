package org.launchcode;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class HashMapPractice {

    public static void main(String[] args){
        // #1 It takes in student names and ID numbers (as integers) instead of names and grades.
        // #2 The keys should be the IDs and the values should be the names.

        HashMap <Integer, String> students = new HashMap<>();
        Scanner input =new Scanner(System.in);
        String addName;
        Integer idNum;

        do{
            System.out.println("Enter the name of the student (Or press ENTER when done) : ");
            addName=input.nextLine();

            if(!addName.equals("")){
                System.out.println("Enter the ID number of the student : ");
                idNum = input.nextInt();
                students.put(idNum, addName);

                input.nextLine();                           // Read in the newline before looping back
            }
        }while(!addName.equals(""));
        input.close();

        // #3 Print the roster.
        System.out.println("Class Roster: ");

        for(Map.Entry<Integer, String> student: students.entrySet()){
            System.out.println("Student ID: " + student.getKey() + " " + "Name: " + student.getValue());
        }
    }
}
