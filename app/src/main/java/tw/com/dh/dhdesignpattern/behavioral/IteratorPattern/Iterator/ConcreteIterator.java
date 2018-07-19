package tw.com.dh.dhdesignpattern.behavioral.IteratorPattern.Iterator;

import tw.com.dh.dhdesignpattern.behavioral.IteratorPattern.Aggregate.ConcreteAggregate;

public class ConcreteIterator implements Iterator {

    private ConcreteAggregate aggreate;
    private int cursor;

    public ConcreteIterator(ConcreteAggregate aggreate) {
        this.aggreate = aggreate;
    }

    @Override
    public void first() {
        cursor = 0;
    }

    @Override
    public void next() {
        cursor += 1;
    }

    @Override
    public boolean hasNext() {
        return cursor < aggreate.getList().size();
    }

    @Override
    public boolean isFirst() {
        return cursor == 1;
    }

    @Override
    public boolean isLast() {
        return cursor == aggreate.getList().size() - 1;
    }

    @Override
    public Object getCurrent() {
        return aggreate.getList().get(cursor);
    }
}
