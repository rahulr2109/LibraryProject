package LibraryProject;

import LibraryProject.items.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) { 
        items.add(item);
        System.out.println(item.getTitle() + " added to the library.");
    }

    public void removeItem(Item item) {
        items.remove(item);
        System.out.println(item.getTitle() + " removed from the library.");
    }

    public void borrowItem(Item item) {
        if (item instanceof Periodical) {
            System.out.println("Periodicals cannot be borrowed.");
        } else if (items.contains(item)) {
            items.remove(item);
            System.out.println(item.getTitle() + " has been borrowed.");
        } else {
            System.out.println(item.getTitle() + " is not available in the library.");
        }
    }

    public void returnItem(Item item) {
        items.add(item);
        System.out.println(item.getTitle() + " returned to the library.");
    }

    public void listItems() {
        System.out.println("Items in the library:");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

