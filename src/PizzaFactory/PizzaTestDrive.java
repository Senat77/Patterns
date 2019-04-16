package PizzaFactory;

import PizzaFactory.store.ChicagoStylePizzaStore;
import PizzaFactory.store.NYStylePizzaStore;
import PizzaFactory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("==========");
        pizza = chicagoStore.orderPizza("cheese");
    }
}
