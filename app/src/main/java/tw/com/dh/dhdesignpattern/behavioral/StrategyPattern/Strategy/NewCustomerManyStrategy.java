package tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class NewCustomerManyStrategy implements Strategy {

    @Override
    public int getPrise(int standarPrise) {
        Log.d(AppConstant.APP_TAG, "New customer many * 0.9");
        return (int)((double)standarPrise * 0.9);
    }
}
