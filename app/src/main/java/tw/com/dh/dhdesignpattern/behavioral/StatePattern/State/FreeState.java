package tw.com.dh.dhdesignpattern.behavioral.StatePattern.State;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class FreeState implements State {
    @Override
    public void handle() {
        Log.d(AppConstant.APP_TAG, "Free state process");
    }
}
