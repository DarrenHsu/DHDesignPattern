package tw.com.dh.dhdesignpattern.structural.BridgePattern.Implementor;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class CentralLocking implements Product {
    private final String productName;

    public CentralLocking(String productName){
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        Log.d(AppConstant.APP_TAG, "Producing Central Locking System");
    }
}
