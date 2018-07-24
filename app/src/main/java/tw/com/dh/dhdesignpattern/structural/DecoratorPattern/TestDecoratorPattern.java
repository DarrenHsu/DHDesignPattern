package tw.com.dh.dhdesignpattern.structural.DecoratorPattern;

import android.util.Log;

import java.text.DecimalFormat;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Component.Pizza;
import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Component.SimplyNonVegPizza;
import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Component.SimplyVegPizza;
import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Decorator.Broccoli;
import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Decorator.Cheese;
import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Decorator.Chicken;
import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Decorator.FetaCheese;
import tw.com.dh.dhdesignpattern.structural.DecoratorPattern.Decorator.GreenOlives;

public class TestDecoratorPattern {
    public static void test() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Pizza pizza = new SimplyVegPizza();
        pizza = new Broccoli(pizza);
        pizza = new Chicken(pizza);
        Log.d(AppConstant.APP_TAG, "Desc: " + pizza.getDesc());
        Log.d(AppConstant.APP_TAG, "Price: " + decimalFormat.format(pizza.getPrice()));

        pizza = new SimplyNonVegPizza();
        pizza = new Cheese(pizza);
        pizza = new FetaCheese(pizza);
        pizza = new GreenOlives(pizza);
        Log.d(AppConstant.APP_TAG, "Desc: " + pizza.getDesc());
        Log.d(AppConstant.APP_TAG, "Price: " + decimalFormat.format(pizza.getPrice()));
    }
}
