package tw.com.dh.dhdesignpattern.behavioral.StatePattern.Context;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.StatePattern.State.State;

public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.handle(this);
    }

    public void booked() {
        Log.d(AppConstant.APP_TAG, "Booked state process");
    }

    public void checked() {
        Log.d(AppConstant.APP_TAG, "Checked In state process");
    }

    public void free() {
        Log.d(AppConstant.APP_TAG, "Free state process");
    }
}
