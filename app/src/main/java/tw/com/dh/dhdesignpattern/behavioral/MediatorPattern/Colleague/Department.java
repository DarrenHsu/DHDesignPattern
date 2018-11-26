package tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Colleague;

import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Mediator.Mediator;

public interface Department {
    void setMediator(Mediator mediator);
    void selfAction();
    void outAction();
}
