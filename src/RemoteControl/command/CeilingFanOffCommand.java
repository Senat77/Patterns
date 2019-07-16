package RemoteControl.command;

import RemoteControl.device.CeilingFan;

public class CeilingFanOffCommand extends AbstractCeilingFanCommand {

    public CeilingFanOffCommand(CeilingFan fan) {
        super(fan);
    }

    public void execute() {
        super.execute();
        fan.off();
    }
}
