package tw.com.dh.dhdesignpattern.behavioral.StatePattern.Context;

import tw.com.dh.dhdesignpattern.behavioral.StatePattern.State.State;

public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.handle();
    }
}
