package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import org.launchcode.MenuItem;

public class Menu {

    private ArrayList<MenuItem> items = new ArrayList<>();
    private LocalDate dateUpdated;

    // Constructor - Do we need it for date??
    public Menu(){ }

    // Setter
    public void setItems(MenuItem items) {
        this.items.add(items);
    }

    public void setDateUpdated(LocalDate date){
        this.dateUpdated=date;
    }

    // Getter
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }
}   // End of Class
