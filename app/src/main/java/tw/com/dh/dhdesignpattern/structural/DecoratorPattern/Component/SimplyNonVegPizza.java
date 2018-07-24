package tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Component;

public class SimplyNonVegPizza implements Pizza {
    @Override
    public String getDesc() {
        return "Simply Non Veg Pizza";
    }

    @Override
    public double getPrice() {
        return 330;
    }
}
