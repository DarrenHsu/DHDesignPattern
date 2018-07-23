package tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Subject;

import tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
