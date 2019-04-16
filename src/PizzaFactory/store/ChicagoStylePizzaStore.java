package PizzaFactory.store;

import PizzaFactory.Pizza;
import PizzaFactory.regionpizza.ChicagoStyleCheesePizza;
import PizzaFactory.regionpizza.ChicagoStyleClamPizza;
import PizzaFactory.regionpizza.ChicagoStylePepperoniPizza;
import PizzaFactory.regionpizza.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        switch (type) {
            case ("cheese") -> pizza = new ChicagoStyleCheesePizza();
            case ("pepperoni") -> pizza = new ChicagoStylePepperoniPizza();
            case ("clam") -> pizza = new ChicagoStyleClamPizza();
            case ("veggie") -> pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
