package tw.com.dh.dhdesignpattern.behavioral.StrategyPattern.Strategy;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class OldCustomerFewStrategy implements Strategy {

    @Override
    public int getPrise(int standarPrise) {
        Log.d(AppConstant.APP_TAG, "Old customer few * 0.85");
        return (int)((double)standarPrise * 0.85);
    }
}
