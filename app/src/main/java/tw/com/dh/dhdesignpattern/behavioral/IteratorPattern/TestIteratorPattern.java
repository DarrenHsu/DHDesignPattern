package tw.com.dh.dhdesignpattern.behavioral.IteratorPattern;

import android.util.Log;

import java.util.ArrayList;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.IteratorPattern.Aggregate.ConcreteAggregate;
import tw.com.dh.dhdesignpattern.behavioral.IteratorPattern.Iterator.ConcreteIterator;

public class TestIteratorPattern {
    public static void test() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");

        ConcreteAggregate aggreate = new ConcreteAggregate(list);
        ConcreteIterator iterator = aggreate.getIterator();
        while (iterator.hasNext()) {
            Log.d(AppConstant.APP_TAG, "current " + iterator.getCurrent());
            iterator.next();
        }
    }
}
