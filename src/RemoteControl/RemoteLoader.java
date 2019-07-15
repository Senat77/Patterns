package RemoteControl;

import RemoteControl.command.*;
import RemoteControl.device.GarageDoor;
import RemoteControl.device.Light;
import RemoteControl.device.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // Devices
        Light light = new Light();
        GarageDoor door = new GarageDoor();
        Stereo stereo = new Stereo();

        // Commands
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(door);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // Buttons on remote control
        remote.setCommand(0, lightOnCommand, lightOffCommand);
        remote.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remote.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remote);

        // Push buttons
        System.out.println("\n=== Light ===");
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();

        System.out.println("\n=== Garage Door ===");
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();

        System.out.println("\n=== Stereo ===");
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.undoButtonWasPushed();
    }
}
