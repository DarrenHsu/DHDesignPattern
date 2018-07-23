package tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Subject;

import java.util.ArrayList;
import java.util.List;

import tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Observer.Observer;

public class ConcreteSubject implements Subject {
    private List<Observer> list = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: list) {
            observer.update(this);
        }
    }
}
