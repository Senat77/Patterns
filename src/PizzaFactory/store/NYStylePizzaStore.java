package PizzaFactory.store;

import PizzaFactory.Pizza;
import PizzaFactory.factory.NYPizzaIngredientFactory;
import PizzaFactory.factory.PizzaIngredientFactory;
import PizzaFactory.simplypizza.CheesePizza;
import PizzaFactory.simplypizza.ClamPizza;
import PizzaFactory.simplypizza.PepperoniPizza;
import PizzaFactory.simplypizza.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case ("cheese") -> (pizza = new CheesePizza(ingredientFactory)).setName("New York Style Cheese Pizza");
            case ("pepperoni") -> pizza = new PepperoniPizza();
            case ("clam") -> (pizza = new ClamPizza(ingredientFactory)).setName("New York Style Clam Pizza");
            case ("veggie") -> pizza = new VeggiePizza();
        }

        return pizza;
    }
}
