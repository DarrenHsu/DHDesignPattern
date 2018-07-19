package tw.com.dh.dhdesignpattern.behavioral.MediatorPattern;

import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Colleague.Developer;
import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Colleague.Financial;
import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Colleague.Market;
import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Mediator.Mediator;
import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Mediator.President;

public class TestMediatorPattern {
    public static void test() {
        Mediator mediator = new President();

        Market market = new Market(mediator);
        Developer developer = new Developer(mediator);
        Financial financial = new Financial(mediator);

        market.selfAction();
        market.outAction();

    }
}
