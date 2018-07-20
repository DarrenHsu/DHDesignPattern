package tw.com.dh.dhdesignpattern.behavioral.MementoPattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.MementoPattern.CareTaker.EmpCareTaker;
import tw.com.dh.dhdesignpattern.behavioral.MementoPattern.Memento.EmpMemento;
import tw.com.dh.dhdesignpattern.behavioral.MementoPattern.Originator.Emp;

public class TestMementoPattern {
    public static void test() {
        EmpCareTaker careTaker = new EmpCareTaker();

        Emp emp = new Emp("Darren", 36, 2000);
        Log.d(AppConstant.APP_TAG, emp.toString());

        careTaker.setMemento(new EmpMemento(emp));
        emp.setName("Mina");
        emp.setAge(37);
        emp.setSalary(3000);
        Log.d(AppConstant.APP_TAG, emp.toString());

        emp.recovery(careTaker.getMemento());
        Log.d(AppConstant.APP_TAG, emp.toString());
    }
}
