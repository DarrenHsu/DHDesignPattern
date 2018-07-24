package tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Decorator;

import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Component.Pizza;

public class Chicken extends PizzaDecorator {
    private final Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Chicken + (3.55)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.55;
    }
}
