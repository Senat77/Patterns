package Starbuzz;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI };

    protected Size size = Size.TALL;

    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("%s $%.2f",getDescription(),cost());
    }
}
