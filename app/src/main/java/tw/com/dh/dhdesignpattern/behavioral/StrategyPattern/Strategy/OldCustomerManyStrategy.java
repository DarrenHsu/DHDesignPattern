package tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class OldCustomerManyStrategy implements Strategy {

    @Override
    public int getPrise(int standarPrise) {
        Log.d(AppConstant.APP_TAG, "Old customer many * 0.7");
        return (int)((double)standarPrise * 0.7);
    }
}
