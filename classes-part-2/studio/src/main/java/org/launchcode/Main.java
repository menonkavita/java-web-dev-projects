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
        MenuItem menuApp1 = new MenuItem("Fried Mozzarella sticks","Served with Marinara sauce", "Appetizer", 13.79, false);
        MenuItem menuApp2 = new MenuItem("Southwestern Egg rolls", "Crispy flour tortillas, chicken, black beans, corn, jalapeño Jack cheese, red peppers, spinach & served with avocado-ranch", "Appetizer", 12.49, true );
        MenuItem menuApp3 = new MenuItem("Buffalo Chicken Wings", "Boned Chicken Wings baked & served with Buffalo sauce", "Appetizer", 7.99, false);

        MenuItem menuEnt1 = new MenuItem("Soup & House Salad", "Delicious bowl of Soup with a side House Salad", "Entree", 10.29, false);
        MenuItem menuEnt2 = new MenuItem("Chicken Fajitas", "Chicken with grilled veggies & served with Mexican rice, black beans, sour cream, pico & shredded cheese", "Entree", 18.59, false);
        MenuItem menuEnt3 = new MenuItem("Ancho Salmon", "Seared chile-rubbed Atlantic salmon with cilantro pesto, and served with Mexican rice and steamed broccoli", "Entree", 20.49, true );
        MenuItem menuEnt4 = new MenuItem("Specialty Pacific House Pizza", "Fresh baby spinach, fresh onions, fresh mushrooms, tomatoes, black olives, feta, provolone, mozzarella cheese and sprinkled with a garlic herb seasoning", "Entree", 20.49, true );
        MenuItem menuEnt5 = new MenuItem("Honolulu Hawaiian Pizza", "Sliced ham, smoked bacon, pineapple, fresh green peppers, provolone and cheese made with 100% real mozzarella", "Entree", 22.49, false );
        MenuItem menuEnt6 = new MenuItem("Pizza Extravaganza", "Pepperoni, ham, Italian sausage, beef, fresh onions, fresh green peppers, fresh mushrooms and black olives, all sandwiched between two layers of provolone and mozzarella", "Entree", 23.49, true );
        MenuItem menuEnt7 = new MenuItem("Sweet & Spicy Crispy Chicken Sandwich", "Sweet & Spicy Crispy, hand-breaded chicken breast smothered in Sweet Asian Chile sauce with our signature coleslaw on a Brioche bun. Served with classic fries", "Entree", 19.49, true );
        MenuItem menuEnt8 = new MenuItem("Whisky Bacon Burger", "All-beef patty topped with Pepper Jack cheese, crispy onions, Applewood-smoked bacon and Fireball® Whisky-infused steak sauce with lettuce, tomato, onion and pickles on a Brioche bun. Served with classic fries", "Entree", 21.49, false );
        MenuItem menuEnt9 = new MenuItem("Classic Cheese Burger", "Our handcrafted all-beef patty topped with American cheese and lettuce, tomato, onion, pickles on a Brioche bun. Served with classic fries.", "Entree", 19.49, false );

        MenuItem menuDessert1 = new MenuItem("Molten Chocolate Cake", "Chocolate cake with a molten chocolate center, topped with vanilla ice cream in a chocolate shell with caramel drizzle", "Dessert", 9.29, false );
        MenuItem menuDessert2 = new MenuItem("Cheesecake", "Served over strawberry puree","Dessert", 9.29, false);
        MenuItem menuDessert3 = new MenuItem("Apple Pie", "Gooey cinnamon apples nestled under a flaky pie crust", "Dessert", 7.99, true);


        Menu menu1 = new Menu(menuApp1);            // Using Menu Constructor
//        menu1.addItems(menuApp1);
        menu1.addItems(menuApp2);
        menu1.addItems(menuApp3);

        menu1.addItems(menuEnt1);
        menu1.addItems(menuEnt2);
        menu1.addItems(menuEnt3);
        menu1.addItems(menuEnt4);
        menu1.addItems(menuEnt5);
        menu1.addItems(menuEnt6);
        menu1.addItems(menuEnt7);
        menu1.addItems(menuEnt8);
        menu1.addItems(menuEnt9);

        menu1.addItems(menuDessert1);
        menu1.addItems(menuDessert2);
        menu1.addItems(menuDessert3);

        // Menu 2 - Second Menu with just 3 entrees
        ArrayList <MenuItem> menuItemEntree = new ArrayList<>();
        menuItemEntree.add(menuEnt1);
        menuItemEntree.add(menuEnt2);
        menuItemEntree.add(menuEnt3);
        Menu menu2= new Menu(menuItemEntree);


        // getting printed by toString() in MenuItems class
//        System.out.println("\nOur Speciality Items on Today's Menu are: \n");
//        System.out.println(menuApp2);
//        System.out.println(menuEnt3);
//        System.out.println(menuDessert3);

        // printing using toString() from Menu class
        System.out.println(menu1);
        menu1.removeItems(menuEnt9);

//        System.out.println("\nPrinting Updated menu\n");
//        System.out.println(menu1);

        System.out.println("\nPrinting Second Menu\n");
        System.out.println(menu2);

        //Testing equals() in MenuItem class
        if (menuApp1.equals(menuApp2)) {
            System.out.println("Appetizer 1 & Appetizer 2 are same. Make corrections to menu.");
        }
        else{
            System.out.println("No duplicates in Appetizers.");
        }


        // BONUS MISSION:     equals() in addItems() in Menu class
        // If a user tries to add an item that is already on the menu, print a message that warns the user about the duplicate.
        // Also, prevent the duplicates from getting added to the menu.

        menu1.addItems(menuDessert2);
        System.out.println(menu1);
        System.out.println("----- End -----");

    }
}
