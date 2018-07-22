package tw.com.dh.dhdesignpattern.behavioral.TemplateMethodPattern.TemplateMethod;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class DrawMoney extends TemplateMethod {
    @Override
    public void transact() {
        Log.d(AppConstant.APP_TAG,"DrawMoney transact");
    }
}
