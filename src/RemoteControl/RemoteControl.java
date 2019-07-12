package RemoteControl;

import RemoteControl.command.Command;
import RemoteControl.command.NoCommand;

public class RemoteControl {

    private static final int BUTTONS_COUNT = 7;

    private Command[] onCommands;
    private Command [] offCommands;

    public RemoteControl() {
        onCommands = new Command[BUTTONS_COUNT];
        offCommands = new Command[BUTTONS_COUNT];

        Command noCommand = new NoCommand();
        for(int i = 0; i < BUTTONS_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand (int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed (int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed (int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n==========   Remote Control   ==========\n");
        for (int i = 0; i < BUTTONS_COUNT; i++) {
            buffer.append("[slot = " + i + "]\t" + onCommands[i].getClass().getSimpleName() + "\t" + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return buffer.toString();
    }
}
