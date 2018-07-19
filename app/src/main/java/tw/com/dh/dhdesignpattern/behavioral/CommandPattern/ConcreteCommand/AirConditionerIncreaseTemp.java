package tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand;

import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Command;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Receiver.AirConditioner;

public class AirConditionerIncreaseTemp implements Command {
    private AirConditioner airConditioner;

    public AirConditionerIncreaseTemp(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.increassTemp();
    }
}
