package tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Colleague;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.MediatorPattern.Mediator.Mediator;

public class Financial implements Department {
    public static String sKEY = "Financial";
    private Mediator mediator;


    public Financial(Mediator mediator) {
        this.setMediator(mediator);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register(Financial.sKEY, this);
    }

    @Override
    public void selfAction() {
        Log.d(AppConstant.APP_TAG, " do " + Financial.sKEY + " job ");
    }

    @Override
    public void outAction() {
        Log.d(AppConstant.APP_TAG, " do out of " + Financial.sKEY + " job ");
    }
}
