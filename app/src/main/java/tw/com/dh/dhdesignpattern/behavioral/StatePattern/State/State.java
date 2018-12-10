package tw.com.dh.dhdesignpattern.behavioral.StatePattern.State;

import tw.com.dh.dhdesignpattern.behavioral.StatePattern.Context.Context;

public interface State {
    void handle(Context context);
}
