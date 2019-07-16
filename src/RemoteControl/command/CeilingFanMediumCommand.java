package RemoteControl.command;

import RemoteControl.device.CeilingFan;

public class CeilingFanMediumCommand extends AbstractCeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan fan) {
        super(fan);
    }

    public void execute() {
        super.execute();
        fan.medium();
    }
}
