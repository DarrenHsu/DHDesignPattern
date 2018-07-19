package tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand;

import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Command;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Receiver.Light;

public class LightOn implements Command {

    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
