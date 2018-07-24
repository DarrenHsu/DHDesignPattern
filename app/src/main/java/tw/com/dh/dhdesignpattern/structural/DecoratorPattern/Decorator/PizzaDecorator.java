package tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Decorator;

import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Component.Pizza;

public abstract class PizzaDecorator implements Pizza {
    @Override
    public String getDesc() {
        return "Toppings";
    }
}

