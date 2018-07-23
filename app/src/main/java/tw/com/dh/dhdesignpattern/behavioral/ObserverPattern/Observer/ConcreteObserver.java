package tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Observer;

import tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Subject.ConcreteSubject;
import tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Subject.Subject;

public class ConcreteObserver implements Observer {
    private int myState;

    public int getMyState() {
        return myState;
    }

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }
}
