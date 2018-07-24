package tw.com.dh.dhdesignpattern.structural.ProxyPattern.Proxy;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.structural.ProxyPattern.Subject.Star;

public class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        Log.d(AppConstant.APP_TAG, "Proxy Star confer");
    }

    @Override
    public void signContract() {
        Log.d(AppConstant.APP_TAG, "Proxy Star signContract");
    }

    @Override
    public void bookTicket() {
        Log.d(AppConstant.APP_TAG, "Proxy Star bookTicket");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        Log.d(AppConstant.APP_TAG, "Proxy Star collectMoney");
    }
}
