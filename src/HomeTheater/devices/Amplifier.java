package HomeTheater.devices;

public class Amplifier {
    public void on() {
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier - set source = DVD");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier - set surround sound mode");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier - set volume = " + volume);
    }

    public void off() {
        System.out.println("Amplifier - off");
    }
}
