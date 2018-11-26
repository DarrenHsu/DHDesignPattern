package tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Colleague;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Mediator.Mediator;

public class Market implements Department {
    public static String sKEY = "Market";

    private Mediator mediator;

    public Market(Mediator mediator) {
        this.setMediator(mediator);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register(Market.sKEY, this);
    }

    @Override
    public void selfAction() {
        Log.d(AppConstant.APP_TAG, " do " + Market.sKEY + " job ");
    }

    @Override
    public void outAction() {
        Log.d(AppConstant.APP_TAG, " do out of " + Market.sKEY + " job ");
        mediator.command(Financial.sKEY);
    }
}
