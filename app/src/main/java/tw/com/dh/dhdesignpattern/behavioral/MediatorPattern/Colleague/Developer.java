package tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Colleague;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Mediator.Mediator;

public class Developer implements Department {
    public static String sKEY = "Developer";

    private Mediator mediator;

    public Developer(Mediator mediator) {
        this.setMediator(mediator);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register(Developer.sKEY, this);
    }

    @Override
    public void selfAction() {
        Log.d(AppConstant.APP_TAG, " do " + Developer.sKEY + " job ");
    }

    @Override
    public void outAction() {
        Log.d(AppConstant.APP_TAG, " do out of " + Developer.sKEY + " job ");
        mediator.command(Financial.sKEY);
    }
}
