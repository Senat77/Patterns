package HomeTheater.devices;

public class DvdPlayer {

    public void on() {
        System.out.println("DVD - on");
    }

    public void play(String movie) {
        System.out.println("DVD - play movie " + movie);
    }

    public void stop() {
        System.out.println("DVD - stop");
    }

    public void eject() {
        System.out.println("DVD - eject disk");
    }

    public void off() {
        System.out.println("DVD - off");
    }
}
