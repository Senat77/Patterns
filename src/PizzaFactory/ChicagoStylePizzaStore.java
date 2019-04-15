package PizzaFactory;

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
