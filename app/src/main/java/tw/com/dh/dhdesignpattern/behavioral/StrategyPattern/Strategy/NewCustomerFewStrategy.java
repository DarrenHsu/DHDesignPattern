package tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class NewCustomerFewStrategy implements Strategy {

    @Override
    public int getPrise(int standarPrise) {
        Log.d(AppConstant.APP_TAG, "New customer * 1");
        return standarPrise;
    }
}
