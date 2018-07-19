package tw.com.dh.dhdesignpattern.behavioral.CommandPattern;

import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand.AirConditionerOff;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand.AirConditionerOn;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand.LightOff;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand.LightOn;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Invoker.RemoteController;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Receiver.AirConditioner;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Receiver.Light;

public class TestCommandPattern {
    public static void test() {
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();

        LightOn lightOn = new LightOn(light);
        LightOff lightOff = new LightOff(light);

        AirConditionerOn airConditionerOn = new AirConditionerOn(airConditioner);
        AirConditionerOff airConditionerOff = new AirConditionerOff(airConditioner);

        RemoteController controller = new RemoteController();
        controller.insertOnCommand(lightOn);
        controller.insertOnCommand(airConditionerOn);

        controller.insertOffCommand(lightOff);
        controller.insertOffCommand(airConditionerOff);

        controller.preaseOnCommand(0);
        controller.pressOffCommand(0);
        controller.preaseOnCommand(1);
        controller.pressOffCommand(1);
    }
}

