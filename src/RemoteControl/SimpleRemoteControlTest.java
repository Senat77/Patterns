package RemoteControl;

import RemoteControl.command.GarageDoorOpenCommand;
import RemoteControl.command.LightOnCommand;
import RemoteControl.device.GarageDoor;
import RemoteControl.device.Light;

public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor door = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(door);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
