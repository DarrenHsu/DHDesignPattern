package tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Mediator;

import java.util.HashMap;
import java.util.Map;

import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Colleague.Department;

public class President implements Mediator {

    private HashMap<String, Department> colleague = new HashMap<>();

    @Override
    public void register(String name, Department dep) {
        colleague.put(name, dep);
    }

    @Override
    public void command(String dname) {
        Department dep = colleague.get(dname);
        dep.selfAction();
        dep.outAction();
    }
}
