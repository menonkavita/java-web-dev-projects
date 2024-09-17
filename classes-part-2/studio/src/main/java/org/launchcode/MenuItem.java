package org.launchcode;
import java.time.LocalDate;

public class MenuItem {
    private String itemName;
    private String description;
    private String category;
    private double price;
    private boolean isNew;
    private final LocalDate dateAdded;

    //Constructor 1
    public MenuItem(String name, String desc, String cat, double p, boolean iN) {
        this.itemName=name;
        this.description=desc;
        this.category=cat;
        this.price = p;
        this.isNew = iN;
        this.dateAdded = LocalDate.now();
    }

    //Constructor 2: Overloading (in case date is provided while creating object)
    public MenuItem(String name, String description, String category, double price, boolean isNew, LocalDate date){
        this.itemName=name;
        this.description=description;
        this.category=category;
        this.price=price;
        this.isNew=isNew;
        this.dateAdded = date;
    }


    // Add Setters - all fields can be set except date
    public void setItemName(String name){ this.itemName=name; }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) { this.category = category;}
    public void setPrice(double price) {
        this.price = price;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    // Add Getters
    public String getItemName(){
        return this.itemName;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public String getCategory(){
        return this.category;
    }

    public LocalDate getDateAdded() {
        return this.dateAdded;
    }

    public boolean getIsNew(){
        return this.isNew;
    }


    // Custom methods to display text
    // toString()
    @Override
    public String toString(){
        String text = isNew ? " - New\n" : "\n";
        return itemName + text + description + "\n$" + price + "\n" ;
    }

    // equals()
    @Override
    public boolean equals(Object toBeCompared){
        if (this == toBeCompared){
            return true;
        }
        if (toBeCompared == null){
            return false;
        }
        if(toBeCompared.getClass() != getClass()){
            return false;
        }

        MenuItem checkItem = (MenuItem) toBeCompared;
        return this.itemName.equals(checkItem.getItemName());

    }

}  // End of Class

