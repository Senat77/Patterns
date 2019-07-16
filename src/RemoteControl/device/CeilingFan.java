package RemoteControl.device;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        System.out.println("Fan speed - HIGH");
        speed = HIGH;
    }

    public void medium() {
        System.out.println("Fan speed - MEDIUM");
        speed = MEDIUM;
    }

    public void low() {
        System.out.println("Fan speed - LOW");
        speed = LOW;
    }

    public void off() {
        System.out.println("Fan OFF");
        speed = OFF;
    }

    public int getSpeed() {
        return  speed;
    }
}
