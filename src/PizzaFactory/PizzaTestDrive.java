package PizzaFactory;

import PizzaFactory.store.ChicagoStylePizzaStore;
import PizzaFactory.store.NYStylePizzaStore;
import PizzaFactory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");

        System.out.println(nyPizza);
        System.out.println(chicagoPizza);
    }
}
