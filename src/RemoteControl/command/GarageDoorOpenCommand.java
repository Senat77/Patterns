package RemoteControl.command;

import RemoteControl.RemoteControl;
import RemoteControl.command.Command;
import RemoteControl.device.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
