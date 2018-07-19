package tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.Handlers;

import tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.LeaveRequest;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void heandleRequest(LeaveRequest request);
}

