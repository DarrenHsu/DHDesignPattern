package tw.com.dh.dhdesignpattern.behavioral.StatePattern.State;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class CheckedInState implements State {
    @Override
    public void handle() {
        Log.d(AppConstant.APP_TAG, "Checked In state process");
    }
}
