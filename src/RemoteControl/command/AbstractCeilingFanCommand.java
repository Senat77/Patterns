package RemoteControl.command;

import RemoteControl.device.CeilingFan;

import static RemoteControl.device.CeilingFan.*;

public abstract class AbstractCeilingFanCommand implements Command {

    protected CeilingFan fan;
    private int prevSpeed;

    public AbstractCeilingFanCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public void execute() {
        prevSpeed = fan.getSpeed();
    }

    public void undo() {
        switch (prevSpeed) {
            case HIGH -> {
                fan.high();
                break;
            }
            case MEDIUM -> {
                fan.medium();
                break;
            }
            case LOW -> {
                fan.low();
                break;
            }
            case OFF -> {
                fan.off();
                break;
            }
        }
    }
}
