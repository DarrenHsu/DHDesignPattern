package tw.com.dh.dhdesignpattern.creational.SingletonPattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class SingletonEager {

    private volatile static SingletonEager instance = null;

    public static SingletonEager getInstance() {
        if (instance == null) {
            synchronized (SingletonEager.class) {
                if (instance == null) {
                    instance = new SingletonEager();
                }
            }
        }
        return instance;
    }

    public void run() {
        Log.d(AppConstant.APP_TAG, "singleton run");
    }
}
