package tw.com.dh.dhdesignpattern.behavioral.ObserverPattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Observer.ConcreteObserver;
import tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Observer.Observer;
import tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.Subject.ConcreteSubject;

public class TestObserverPattern {
    public static void test() {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver ob1 = new ConcreteObserver();
        ConcreteObserver ob2 = new ConcreteObserver();
        ConcreteObserver ob3 = new ConcreteObserver();

        subject.registerObserver(ob1);
        subject.registerObserver(ob2);
        subject.registerObserver(ob3);

        subject.setState(300);
        Log.d(AppConstant.APP_TAG, "ob1 state " + ob1.getMyState());
        Log.d(AppConstant.APP_TAG, "ob2 state " + ob1.getMyState());
        Log.d(AppConstant.APP_TAG, "ob3 state " + ob1.getMyState());

        subject.removeObserver(ob2);

        subject.setState(30);
        Log.d(AppConstant.APP_TAG, "ob1 state " + ob1.getMyState());
        Log.d(AppConstant.APP_TAG, "ob2 state " + ob1.getMyState());
        Log.d(AppConstant.APP_TAG, "ob3 state " + ob1.getMyState());
    }
}
