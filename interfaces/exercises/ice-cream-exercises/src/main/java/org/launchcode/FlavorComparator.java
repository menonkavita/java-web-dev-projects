package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {

        //  Exercise #3:  sorting in descending order - item with most allergens at top of the list
//        if(flavor2.getAllergens().size() - flavor1.getAllergens().size() < 0 ){
//            return -1;
//        }
//        else if(flavor2.getAllergens().size() - flavor1.getAllergens().size() > 0){
//            return 1;
//        }
//        else{
//            return 0;
//        }

        //  Exercise #3:  sorting in ascending order - item with least number of allergens at top of the list
//        if(flavor1.getAllergens().size() - flavor2.getAllergens().size() < 0 ){
//            return -1;
//        }
//        else if(flavor1.getAllergens().size() - flavor2.getAllergens().size() > 0){
//            return 1;
//        }
//        else{
//            return 0;
//        }

        // Exercise #1: sorts flavors by name in ascending order
        return flavor1.getName().compareTo(flavor2.getName()); // Sorts flavors
    }

}
