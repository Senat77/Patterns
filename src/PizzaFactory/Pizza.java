package PizzaFactory;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough + " ...");
        System.out.println("Adding sauce " + sauce + " ...");
        System.out.println("Adding toppings :");
        toppings.forEach(s -> System.out.println("\t" + s));
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
