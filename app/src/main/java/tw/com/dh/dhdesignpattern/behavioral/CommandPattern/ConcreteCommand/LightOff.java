package tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand;

import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Command;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Receiver.Light;

public class LightOff implements Command {
    private Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
