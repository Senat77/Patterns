package CoffeeAndTea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWasCondiments()) {
            addCondiments();
        }
    }

    public boolean customerWasCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public String getUserInput() {
        String answer = null;

        System.out.println("Would you like condiments with your " + this.getClass().getSimpleName() + " (y/n) ?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null)
            return "no";
        return answer;
    }
}
