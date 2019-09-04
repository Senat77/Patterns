package BistroAndPancake;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {

        menuItems = new ArrayList<>();

        addItem("Regular Pancake Breakfast", "Pancakes with eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes makes with fresh blueberries", true, 1.5);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem (String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
