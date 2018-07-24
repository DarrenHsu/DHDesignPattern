package tw.com.dh.dhdesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.TestChainOfResponsibilityPattern;
import tw.com.dh.dhdesignpattern.behavioral.CommandPattern.TestCommandPattern;
import tw.com.dh.dhdesignpattern.behavioral.InterpreterPattern.TestInterpreterPattern;
import tw.com.dh.dhdesignpattern.behavioral.IteratorPattern.TestIteratorPattern;
import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.TestMediatorPattern;
import tw.com.dh.dhdesignpattern.behavioral.MementoPattern.TestMementoPattern;
import tw.com.dh.dhdesignpattern.behavioral.ObserverPattern.TestObserverPattern;
import tw.com.dh.dhdesignpattern.behavioral.StatePattern.TestStatePattern;
import tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.TestStrategyPattern;
import tw.com.dh.dhdesignpattern.behavioral.TemplateMethodPattern.TestTemplateMethodPattern;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.TestVisitorPattern;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.TestAbstractFactoryPattern;
import tw.com.dh.dhdesignpattern.creational.BuilderPattern.TestBuilderPattern;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.TestFactoryMethodPattern;
import tw.com.dh.dhdesignpattern.creational.PrototypePattern.TestPrototypePattern;
import tw.com.dh.dhdesignpattern.creational.SingletonPattern.TestSingletonPattern;
import tw.com.dh.dhdesignpattern.structural.AdapterPattern.TestAdapterPattern;
import tw.com.dh.dhdesignpattern.structural.BridgePattern.TestBridgePattern;
import tw.com.dh.dhdesignpattern.structural.CompositePattern.TestCompositePattern;
import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.TestDecoratorPattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testCreational();
        testBehavioral();
        testStructural();
    }

    public void testStructural() {
        Log.i(AppConstant.APP_TAG, "Test Adapter");
        TestAdapterPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Composite");
        TestCompositePattern.test();

        Log.i(AppConstant.APP_TAG, "Test Bridge");
        TestBridgePattern.test();

        Log.i(AppConstant.APP_TAG, "Test Decorate");
        TestDecoratorPattern.test();
    }

    public void testBehavioral() {
        Log.i(AppConstant.APP_TAG, "Test Chanin Of Responsibility");
        TestChainOfResponsibilityPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Command");
        TestCommandPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Interpreter");
        TestInterpreterPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Iterator");
        TestIteratorPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Mediator");
        TestMediatorPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Memento");
        TestMementoPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Visitor");
        TestVisitorPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Strategy");
        TestStrategyPattern.test();

        Log.i(AppConstant.APP_TAG, "Test State");
        TestStatePattern.test();

        Log.i(AppConstant.APP_TAG, "Test Observer");
        TestObserverPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Template Method");
        TestTemplateMethodPattern.test();
    }

    public void testCreational() {
        Log.i(AppConstant.APP_TAG, "Test Factory Method");
        TestFactoryMethodPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Abstract Factory");
        TestAbstractFactoryPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Builder");
        TestBuilderPattern.test();

        Log.i(AppConstant.APP_TAG, "Test Prototype");
        TestPrototypePattern.test();

        Log.i(AppConstant.APP_TAG, "Test Singleton");
        TestSingletonPattern.test();
    }
}
