package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        //System.out.println("Before: \n" + flavors);

        System.out.println("\nBefore - Flavors: \n");
        for(int i = 0; i< flavors.size(); i++){
            System.out.print(flavors.get(i));
        }

        Comparator flavorComparator = new FlavorComparator();
        flavors.sort(flavorComparator);
        //flavors.sort(new FlavorComparator());

        System.out.println("\nAfter - Flavors: \n");
        for(int i=0; i< flavors.size(); i++){
            System.out.print(flavors.get(i));
        }

        // BONUS EXERCISES #1: (Done) Modify FlavorComparator to sort Flavor objects by the number of allergens, from highest to lowest.
        // Modified FlavorComparator & toString() in Flavor class to sort Flavor objects by the number of allergens, from highest to lowest.
        // Flavors List printed after Flavors sort, above.
        // Modify(commented section) in FlavorComparator to print desired results - order by name, order by allergens,
        // reverse order by allergens.


        //System.out.println("\nAfter: \n" + flavors);  // uses toString() in Flavor & Ingredient classes

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        System.out.println("\nBefore - Cones: \n");
        for(int j = 0; j < cones.size(); j++){
            System.out.print(cones.get(j));
        }

        Comparator conesComparator = new ConeComparator();
        cones.sort(conesComparator);

        System.out.println("\nAfter - Cones: \n");
        for(int j = 0; j < cones.size(); j++){
            System.out.print(cones.get(j));
        }


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        // Printing 'flavors' (line #27) and 'cones' (line #50) lists after they are sorted (refer above)



        // BONUS EXERCISES #2: (Done)
        // Create a Topping class that extends Ingredient. Add toppings to the Case constructor,
        // then choose how to sort a toppings array in Main.

        System.out.println("\nBefore - Toppings: \n");
        for(int j = 0; j < toppings.size(); j++){
            System.out.print(toppings.get(j));
        }

        // Subtraction sort
        // Sorting based on least number of toppings -
        // list will be sorted with least number of allergens on top of list

        toppings.sort(new Comparator<Topping>() {
            @Override
            public int compare(Topping topping1, Topping topping2) {
                if (topping1.getAllergens().size() - topping2.getAllergens().size() < 0) {
                    return -1;
                } else if (topping2.getAllergens().size() - topping1.getAllergens().size() > 0) {
                    return 1;
                } else {
                    return 0;
                }
            } // end of comparator()
        }); // end of sort()

        System.out.println("\nAfter - Toppings: \n");
        for(int j = 0; j < toppings.size(); j++){
            System.out.print(toppings.get(j));
        }

    } // end of main()

} // end of class