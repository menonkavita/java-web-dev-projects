package org.launchcode;

import org.launchcode.MenuItem;
import org.launchcode.Menu;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import org.launchcode.MenuItem;
import org.launchcode.Menu;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MenuItem menuApp1 = new MenuItem("Fried Mozzarella sticks","Served with Marinara sauce", "Appetizer", 13.79, false);
        MenuItem menuApp2 = new MenuItem("Southwestern Egg rolls", "Crispy flour tortillas, chicken, black beans, corn, jalapeño Jack cheese, red peppers, spinach & served with avocado-ranch", "Appetizer", 12.49, true );
        MenuItem menuApp3 = new MenuItem("Buffalo Chicken Wings", "Boned Chicken Wings baked & served with Buffalo sauce", "Appetizer", 7.99, false);

        MenuItem menuEnt1 = new MenuItem("Soup & House Salad", "Delicious bowl of Soup with a side House Salad", "Entree", 10.29, false);
        MenuItem menuEnt2 = new MenuItem("Chicken Fajitas", "Chicken with grilled veggies & served with Mexican rice, black beans, sour cream, pico & shredded cheese", "Entree", 18.59, false);
        MenuItem menuEnt3 = new MenuItem("Ancho Salmon", "Seared chile-rubbed Atlantic salmon with cilantro pesto, and served with Mexican rice and steamed broccoli", "Entree", 20.49, true );

        MenuItem menuDessert1 = new MenuItem("Molten Chocolate Cake", "Chocolate cake with a molten chocolate center, topped with vanilla ice cream in a chocolate shell with caramel drizzle", "Dessert", 9.29, false );
        MenuItem menuDessert2 = new MenuItem("Cheesecake", "Served over strawberry puree","Dessert", 9.29, false);
        MenuItem menuDessert3 = new MenuItem("Apple Pie", "Gooey cinnamon apples nestled under a flaky pie crust", "Dessert", 7.99, true);


        Menu menu1 = new Menu();
        menu1.setItems(menuApp1);
        menu1.setItems(menuApp2);
        menu1.setItems(menuApp3);

        menu1.setItems(menuEnt1);
        menu1.setItems(menuEnt2);
        menu1.setItems(menuEnt3);

        menu1.setItems(menuDessert1);
        menu1.setItems(menuDessert2);
        menu1.setItems(menuDessert3);

        System.out.println("\nOur Speciality Items on Today's Menu are: \n");
        System.out.println(menuApp2);
        System.out.println(menuEnt3);
        System.out.println(menuDessert3);

    }
}
