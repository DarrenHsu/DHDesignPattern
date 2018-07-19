package tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand;

import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Command;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Receiver.AirConditioner;

public class AirConditionerOff implements Command {
    private AirConditioner airConditioner;

    public AirConditionerOff(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}
