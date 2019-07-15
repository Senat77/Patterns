package RemoteControl.device;

public class Stereo {

    private int volume;

    public void on() {
        System.out.println(this.getClass().getSimpleName() + " on");
    }

    public void off() {
        System.out.println(this.getClass().getSimpleName() + " off");
    }
    public void setCD() {
        System.out.println(this.getClass().getSimpleName() + " set CD");
    }

    public void setDVD() {
        System.out.println(this.getClass().getSimpleName() + " set DVD");
    }

    public void setRadio() {
        System.out.println(this.getClass().getSimpleName() + " set Radio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(this.getClass().getSimpleName() + " set volume = " + volume);
    }
    public void mute() {
        this.volume = 0;
        System.out.println(this.getClass().getSimpleName() + " mute");
    }
}
