package RemoteControl.command;

import RemoteControl.device.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    private GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }

    @Override
    public void undo() {
        door.up();
    }
}
