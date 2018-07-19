package tw.com.dh.dhdesignpattern.behavioral.IteratorPattern.Iterator;

public interface Iterator {
    void first();
    void next();
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object getCurrent();
}
