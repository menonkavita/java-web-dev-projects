package org.launchcode;
import java.time.LocalDate;

public class MenuItem {

    private String itemName;
    private String description;
    private String category;
    private double price;
    private boolean isNew;
    private LocalDate dateAdded;

    //Constructor 1
    public MenuItem(String name, String description, String category, double price, boolean isNew){
        this.itemName=name;
        this.description=description;
        this.category=category;
        this.price=price;
        this.isNew=isNew;
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


    // Add Setters
    public void setItemName(String name){
        this.itemName=name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setCategory(String category){
        this.category=category;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public void setIsNew(boolean isNew){
        this.isNew=isNew;
    }

    public void setDateAdded(LocalDate date){
        this.dateAdded=date;
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
    @Override
    public String toString(){
        String text= isNew ? " - New\n" : "";
        return itemName + text + description + "\n$" + price + "\n";
    }


}  // End of Class
