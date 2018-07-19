package tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Mediator;

import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Colleague.Department;

public interface Mediator {
    void register(String name, Department dep);
    void command(String dname);
}
