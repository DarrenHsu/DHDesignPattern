package tw.com.dh.dhdesignpattern.behavioral.CommandPattern.Receiver;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class AirConditioner {
    public void turnOn() {
        Log.d(AppConstant.APP_TAG, "light on");
    }

    public void turnOff() {
        Log.d(AppConstant.APP_TAG, "light off");
    }

    public void increassTemp() {
        Log.d(AppConstant.APP_TAG, "AirConditioner increase temp");
    }

    public void decreaseTemp() {
        Log.d(AppConstant.APP_TAG, "AirConditioner decrease temp");
    }
}
