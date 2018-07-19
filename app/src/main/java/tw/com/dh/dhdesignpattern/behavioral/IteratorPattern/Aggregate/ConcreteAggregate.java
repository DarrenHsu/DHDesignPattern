package tw.com.dh.dhdesignpattern.behavioral.IteratorPattern.Aggregate;

import java.util.ArrayList;

import tw.com.dh.dhdesignpattern.behavioral.IteratorPattern.Iterator.ConcreteIterator;

public class ConcreteAggregate implements Aggregate {

    private ArrayList<Object> list;

    public ConcreteAggregate(ArrayList<Object> list) {
        this.list = list;
    }

    public void addObject(Object object) {
        list.add(object);
    }

    public void removeObject(Object object) {
        list.remove(object);
    }

    public ArrayList<Object> getList() {
        return list;
    }

    public ConcreteIterator getIterator() {
        return new ConcreteIterator(this);
    }
}
