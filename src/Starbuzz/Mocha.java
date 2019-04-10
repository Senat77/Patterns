package Starbuzz;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        switch (beverage.size) {
            case TALL:      return beverage.cost() + .05;
            case GRANDE:    return beverage.cost() + .20;
            default:        return beverage.cost() + .10;
        }
    }
}
