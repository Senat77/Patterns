package RemoteControl;

import RemoteControl.command.*;
import RemoteControl.device.CeilingFan;
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
        CeilingFan fan = new CeilingFan("Living Room");

        // Commands
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(door);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(fan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(fan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(fan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(fan);

        Command[] partyOnCommandsArray = new Command[] {lightOnCommand, stereoOnWithCDCommand, ceilingFanHighCommand};
        Command[] partyOffCommandsArray = new Command[] {lightOffCommand, stereoOffCommand, ceilingFanOffCommand};
        MacroCommand partyOnCommand = new MacroCommand(partyOnCommandsArray);
        MacroCommand partyOffCommand = new MacroCommand(partyOffCommandsArray);

        // Buttons on remote control
        remote.setCommand(0, lightOnCommand, lightOffCommand);
        remote.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remote.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);
        remote.setCommand(3, ceilingFanMediumCommand, ceilingFanOffCommand);
        remote.setCommand(4, ceilingFanHighCommand, ceilingFanOffCommand);
        remote.setCommand(5, partyOnCommand, partyOffCommand);

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

        System.out.println("\n=== Ceiling Fan ===");
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(4);
        remote.undoButtonWasPushed();

        System.out.println("\n=== Party !!! ===");
        remote.onButtonWasPushed(5);
        remote.offButtonWasPushed(5);
        remote.onButtonWasPushed(5);
        remote.undoButtonWasPushed();
    }
}
