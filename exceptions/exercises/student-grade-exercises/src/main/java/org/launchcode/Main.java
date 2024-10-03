package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        int x, y;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to be divided: ");
        x = input.nextInt();

        System.out.println("Enter the number to divide with: ");
        y = input.nextInt();

        //Divide(10, 0);
        Divide(x,y);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Aaron", " ");
        //studentFiles.put("Aaron", null);

  //         for(String file: studentFiles.values()){

        for(Map.Entry<String, String> file: studentFiles.entrySet()){
            int returnVal = CheckFileExtension(file.getValue());

            if (returnVal == 1){
                System.out.println(file.getKey() + "'s work file ends in .java");
            }
            else if(returnVal == 0){
                System.out.println(file.getKey() + "'s work file does not end in .java");
            }
            else{
                System.out.println(file.getKey() + "'s work has not been submitted");
            }
        }
        // Test out your CheckFileExtension() function!

        input.close();
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        if (y==0) {
            try{
                //throw new ExerciseException("Number entered as Divisor is 0\n");
                throw new ArithmeticException(" Trying to divide number by 0\n");
            }
            catch(ArithmeticException a){
                System.out.println("\nPrinting out the Stack trace\n");
                a.printStackTrace();
            }
        }
        else{
            System.out.println("\n" + x + " divided by " + y + " is " + x/y + "\n");
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!

        if (fileName.contains(".java")){        // file ends in .java
            return 1;
        }
        // file name is empty/blank
        else if(fileName == null || fileName.isEmpty()){        // file name is 'null'
            //  || !fileName.matches("^[a-zA-Z]+$")
            try{
                throw new NullPointerException("File name is empty or 'null'");
            }
            catch(NullPointerException n){
                n.printStackTrace();
                return -1;
            }
        }
        else{               // file doesn't end in .java
            return 0;
        }
    }
}