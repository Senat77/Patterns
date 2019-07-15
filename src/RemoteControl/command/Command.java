package RemoteControl.command;

import RemoteControl.RemoteControl;

public interface Command {

    public void execute();
    public void undo();
}
