package tw.com.dh.dhdesignpattern.behavioral.StatePattern.State;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class BookedState implements State {
    @Override
    public void handle() {
        Log.d(AppConstant.APP_TAG, "Booked state process");
    }
}
