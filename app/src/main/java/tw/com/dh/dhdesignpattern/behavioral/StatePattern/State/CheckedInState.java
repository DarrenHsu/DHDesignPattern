package tw.com.dh.dhdesignpattern.behavioral.StatePattern.State;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.StatePattern.Context.Context;

public class CheckedInState implements State {
    @Override
    public void handle(Context context) {
        context.checked();
    }
}
