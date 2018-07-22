package tw.com.dh.dhdesignpattern.behavioral.TemplateMethodPattern.TemplateMethod;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public abstract class TemplateMethod {
    public void takeNumber() {
        Log.d(AppConstant.APP_TAG, "take number");
    }

    public abstract void transact();

    public void evaluate() {
        Log.d(AppConstant.APP_TAG, "evaluate");
    }

    public final void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
