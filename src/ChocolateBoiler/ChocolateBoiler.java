package ChocolateBoiler;

public class ChocolateBoiler {

    private volatile static ChocolateBoiler boiler;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getBoiler() {
        if(boiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (boiler == null) {
                    boiler = new ChocolateBoiler();
                }
            }
        }
        return boiler;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
