package tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern;

import tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.Handlers.Director;
import tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.Handlers.GeneralManager;
import tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.Handlers.Leader;
import tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.Handlers.Manager;

public class TestChainOfResponsibilityPattern {
    public static void test() {
        Leader l1 = new Director("Director A");
        Leader l2 = new Manager("Manager A");
        Leader l3 = new GeneralManager("General Manager A");

        l1.setNextLeader(l2);
        l2.setNextLeader(l3);

        LeaveRequest request = new LeaveRequest("Darren", 20, "wedding!");
        l1.heandleRequest(request);
    }
}
