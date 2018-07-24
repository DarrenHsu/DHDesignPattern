package tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Decorator;

import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Component.Pizza;

public class FetaCheese extends PizzaDecorator {
    private final Pizza pizza;

    public FetaCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", FetaCheese + (2.99)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2.99;
    }
}
