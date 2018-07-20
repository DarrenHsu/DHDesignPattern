package tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Invoker;


import java.util.ArrayList;

import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.ConcreteCommand.Command;

public class RemoteController {

    private ArrayList<Command> turnOnCommands = new ArrayList<>();
    private ArrayList<Command> turnOffCommands = new ArrayList<>();

    public void insertOnCommand(Command command) {
        turnOnCommands.add(command);
    }

    public void insertOffCommand(Command command) {
        turnOffCommands.add(command);
    }

    public void preaseOnCommand(int buttonIndex) {
        turnOnCommands.get(buttonIndex).execute();
    }

    public void pressOffCommand(int buttonIndex) {
        turnOffCommands.get(buttonIndex).execute();
    }

}
