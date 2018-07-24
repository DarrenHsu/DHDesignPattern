package tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Decorator;

import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Component.Pizza;

public class GreenOlives extends PizzaDecorator {
    private final Pizza pizza;

    public GreenOlives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Green Olives + (1.55)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.55;
    }
}
