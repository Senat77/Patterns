package BistroAndPancake;

import java.util.Iterator;

public class Waitress {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("===== Breakfast Menu =====");
        printMenu(pancakeIterator);
        System.out.println("===== Lunch Menu =====");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.name);
            System.out.print(", " + menuItem.description);
            System.out.println(", price = " + menuItem.price);
        }
    }
}
