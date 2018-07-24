package tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Component;

public class SimplyVegPizza implements  Pizza {
    @Override
    public String getDesc() {
        return "SimplyVeg Pizza";
    }

    @Override
    public double getPrice() {
        return 230;
    }
}
