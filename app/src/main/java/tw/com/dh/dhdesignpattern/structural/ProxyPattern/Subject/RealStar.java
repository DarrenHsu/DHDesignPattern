package tw.com.dh.dhdesignpattern.structural.ProxyPattern.Subject;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class RealStar implements Star {

    @Override
    public void confer() {
        Log.d(AppConstant.APP_TAG, "Real Star confer");
    }

    @Override
    public void signContract() {
        Log.d(AppConstant.APP_TAG, "Real Star signContract");
    }

    @Override
    public void bookTicket() {
        Log.d(AppConstant.APP_TAG, "Real Star bookTicket");
    }

    @Override
    public void sing() {
        Log.d(AppConstant.APP_TAG, "Real Star sing");
    }

    @Override
    public void collectMoney() {
        Log.d(AppConstant.APP_TAG, "Real Star collectMoney");
    }
}
