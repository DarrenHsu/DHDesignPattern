package tw.com.dh.dhdesignpattern.behavioral.MementoPattern.CareTaker;

import tw.com.dh.dhdesignpattern.behavioral.MementoPattern.Memento.EmpMemento;

public class EmpCareTaker {
    private EmpMemento memento;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
