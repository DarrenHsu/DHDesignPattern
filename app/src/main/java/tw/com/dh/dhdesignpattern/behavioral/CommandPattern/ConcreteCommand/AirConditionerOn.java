package tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand;

import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Receiver.AirConditioner;

public class AirConditionerOn implements Command {
    private AirConditioner airConditioner;

    public AirConditionerOn(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
