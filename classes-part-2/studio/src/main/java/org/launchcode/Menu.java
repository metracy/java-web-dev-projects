package org.launchcode;


import java.util.Date;
import java.util.ArrayList;


public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date theDate, ArrayList<MenuItem> items) {
        this.lastUpdated = theDate;
        this.items = items;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addToMenu(MenuItem item) {
        items.add(item);
    }

    public void removeFromMenu(MenuItem item) {
        items.remove(item);
    }

    public void displayMenu() {
        System.out.println("----------");
        for(MenuItem item : items){
            System.out.println(item.getDescription());
        }
        System.out.println("----------");
    }
}


