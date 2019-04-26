package PizzaFactory.store;

import PizzaFactory.Pizza;
import PizzaFactory.factory.ChicagoPizzaIngredientFactory;
import PizzaFactory.factory.PizzaIngredientFactory;
import PizzaFactory.simplypizza.CheesePizza;
import PizzaFactory.simplypizza.ClamPizza;
import PizzaFactory.simplypizza.PepperoniPizza;
import PizzaFactory.simplypizza.VeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case ("cheese") -> (pizza = new CheesePizza(ingredientFactory)).setName("Chicago Style Cheese Pizza");
            case ("pepperoni") -> pizza = new PepperoniPizza();
            case ("clam") -> (pizza = new ClamPizza(ingredientFactory)).setName("Chicago Style Clam Pizza");
            case ("veggie") -> pizza = new VeggiePizza();
        }

        return pizza;
    }
}
