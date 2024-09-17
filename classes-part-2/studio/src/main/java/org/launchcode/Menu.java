package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

//    // Constructor 1
    public Menu(MenuItem i) {
        this.menuItems.add(i);
        this.lastUpdated = LocalDate.now();
    }

    // Constructor 2
//    public Menu(ArrayList<MenuItem> i, LocalDate d) {
//        this.items = i;
//        this.lastUpdated = LocalDate.now();
//    }

    // Constructor 3
    public Menu(ArrayList<MenuItem> i) {
        this.menuItems = i;
        this.lastUpdated = LocalDate.now();
    }

    // Add Items
    // Setter - each time a new item is added, update the date
    public void addItems(MenuItem items)
    {

        // BONUS MISSION:     equals()
        // If a user tries to add an item that is already on the menu, print a message that warns the user about the duplicate.
        // Also, prevent the duplicates from getting added to the menu.

        String message = "\nThis item has already been added to the menu.\n";
        // Option #1: contains()
        if(menuItems.contains(items)){
            System.out.println("Duplicate item: " + items.getItemName() + message);
            return;
        }

        // Option 2: equals()
        for(MenuItem i : menuItems){
            if(i.equals(items)){
                System.out.println("Duplicate item: " + items.getItemName() + message );
                return;
            }
        }

        this.menuItems.add(items);
        this.lastUpdated = LocalDate.now();
    }

    // Don't need a separate setter for date, since date will get updated in constructor or setter when new items are added.
    // public void setLastUpdated(LocalDate date){ this.lastUpdated = LocalDate.now(); }
    // Setter - came as part of studio 2 starter code: public void addItems(ArrayList<MenuItem> items) { this.items = items; }

    // Remove Items
    public void removeItems(MenuItem item)
    {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }


    // Getter
    public ArrayList<MenuItem> getItems() { return menuItems;    }
    public LocalDate getDateUpdated() { return lastUpdated; }


    // custom methods to display text
    // to String

    public String toString(){
        StringBuilder appetizers = new StringBuilder();
        for(MenuItem item : menuItems){
            if(item.getCategory().equals("Appetizer")){
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder entrees = new StringBuilder();
        for(MenuItem item : menuItems){
            if(item.getCategory().equals("Entree")){
                entrees.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for(MenuItem item : menuItems){
            if(item.getCategory().equals("Dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }

        return "\nAll American & Tex-Mex Restaurant Menu\n" +
                "\nMenu last updated on:" + lastUpdated + "\n" +
                "\nAPPETIZERS:\n" +  appetizers.toString() +
                "\nENTREES:\n" + entrees +
                "\nDESSERTS:\n" + desserts;
    }  // end of toString()


    // equals()
    // refer addItems() above, where menu items are added

}


