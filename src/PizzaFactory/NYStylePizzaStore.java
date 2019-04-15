package PizzaFactory;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        switch (type) {
            case ("cheese") -> pizza = new NYStyleCheesePizza();
            case ("pepperoni") -> pizza = new NYStylePepperoniPizza();
            case ("clam") -> pizza = new NYStyleClamPizza();
            case ("veggie") -> pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}
