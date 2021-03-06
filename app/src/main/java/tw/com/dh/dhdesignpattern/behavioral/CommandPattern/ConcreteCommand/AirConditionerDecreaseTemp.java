package tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand;

import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Receiver.AirConditioner;

public class AirConditionerDecreaseTemp implements Command {
    private AirConditioner airConditioner;

    public AirConditionerDecreaseTemp(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.decreaseTemp();
    }
}
