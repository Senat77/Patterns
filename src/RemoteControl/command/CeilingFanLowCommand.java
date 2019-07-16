package RemoteControl.command;

import RemoteControl.device.CeilingFan;

public class CeilingFanLowCommand extends AbstractCeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan fan) {
        super(fan);
    }

    public void execute() {
        super.execute();
        fan.low();
    }
}
