package HomeTheater;

import HomeTheater.devices.*;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(), new CdPlayer(),
                                                            new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());

        facade.watchMovie("Test movie");
        System.out.println("==========");
        facade.endMovie();
    }
}
