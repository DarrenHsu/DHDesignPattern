package tw.com.dh.dhdesignpattern.behavioral.StrategyPattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Context.CustomerContext;
import tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy.NewCustomerFewStrategy;
import tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy.NewCustomerManyStrategy;
import tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy.OldCustomerFewStrategy;
import tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy.OldCustomerManyStrategy;
import tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy.Strategy;

public class TestStrategyPattern {
    public static void test() {
        Strategy s1 = new OldCustomerFewStrategy();
        Strategy s2 = new OldCustomerManyStrategy();
        Strategy s3 = new NewCustomerFewStrategy();
        Strategy s4 = new NewCustomerManyStrategy();

        CustomerContext context = new CustomerContext(s1);
        Log.d(AppConstant.APP_TAG, "price " + context.getPrice(100));

        context.setStrategy(s2);
        Log.d(AppConstant.APP_TAG, "price " + context.getPrice(100));

        context.setStrategy(s3);
        Log.d(AppConstant.APP_TAG, "price " + context.getPrice(100));

        context.setStrategy(s4);
        Log.d(AppConstant.APP_TAG, "price " + context.getPrice(100));
    }
}
