package tw.com.dh.dhdesignpattern.behavioral.StatePattern;

import tw.com.dh.dhdesignpattern.behavioral.StatePattern.Context.Context;
import tw.com.dh.dhdesignpattern.behavioral.StatePattern.State.BookedState;
import tw.com.dh.dhdesignpattern.behavioral.StatePattern.State.CheckedInState;
import tw.com.dh.dhdesignpattern.behavioral.StatePattern.State.FreeState;

public class TestStatePattern {
    public static void test() {
        Context context = new Context();
        context.setState(new FreeState());
        context.setState(new BookedState());
        context.setState(new CheckedInState());
    }
}
