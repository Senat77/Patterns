package Starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        this.size = size;
        description = "DarkRoast " + size + " ";
    }

    @Override
    public double cost() {
        switch (size) {
            case TALL: return .8;
            case GRANDE: return 1.2;
            default: return 1;
        }
    }
}
