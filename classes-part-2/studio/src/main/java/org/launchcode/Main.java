package org.launchcode;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        MenuItem curry = new MenuItem(1, "Curry","Entree",true);
        MenuItem bread = new MenuItem(100, "Bread","Appetizer",true);
        MenuItem spaghetti = new MenuItem(0, "Spaghetti","Entree",true);
        MenuItem bakla = new MenuItem(1, "Baklava","Desert",true);
        MenuItem chili = new MenuItem(200, "Chili","Entree",true);

        Menu menu = new Menu(new Date(),new ArrayList<MenuItem>(Arrays.asList(curry, bakla, chili)));

        menu.displayMenu();
        menu.addToMenu(bread);
        menu.addToMenu(spaghetti);
        menu.displayMenu();

        menu.removeFromMenu(bakla);
        menu.removeFromMenu(curry);
        menu.displayMenu();

    }
}
