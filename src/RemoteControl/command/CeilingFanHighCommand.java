package RemoteControl.command;

import RemoteControl.device.CeilingFan;

public class CeilingFanHighCommand extends AbstractCeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan fan) {
        super(fan);
    }

    public void execute() {
        super.execute();
        fan.high();
    }
}
