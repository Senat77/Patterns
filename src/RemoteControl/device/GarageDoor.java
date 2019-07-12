package RemoteControl.device;

public class GarageDoor {

    public void up() {
        System.out.println(this.getClass().getSimpleName() + " open");
    }

    public void down() {
        System.out.println(this.getClass().getSimpleName() + " close");
    }

    public void stop() {
        System.out.println(this.getClass().getSimpleName() + "stop");
    }

    public void lightOn() {
        System.out.println(this.getClass().getSimpleName() + " light on");
    }

    public void lightOff() {
        System.out.println(this.getClass().getSimpleName() + " light off");
    }
}
