package PizzaFactory.factory;

import PizzaFactory.factory.ingredients.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSouce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
