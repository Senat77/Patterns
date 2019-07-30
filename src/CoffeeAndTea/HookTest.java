package CoffeeAndTea;

public class HookTest {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }
}
