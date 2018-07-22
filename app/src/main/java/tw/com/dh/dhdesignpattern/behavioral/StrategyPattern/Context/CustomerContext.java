package tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Context;

import tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy.Strategy;

public class CustomerContext {
    private Strategy strategy;

    public CustomerContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(int price) {
        return strategy.getPrise(price);
    }
}
