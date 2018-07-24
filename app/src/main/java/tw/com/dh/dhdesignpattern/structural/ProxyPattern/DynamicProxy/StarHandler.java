package tw.com.dh.dhdesignpattern.structural.ProxyPattern.DynamicProxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.structural.ProxyPattern.DynamicProxy.Subject.Star;

public class StarHandler implements InvocationHandler {
    private Star start;


    public StarHandler(Star start) {
        this.start = start;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        Log.d(AppConstant.APP_TAG, "invoke " + method.getName());

        method.invoke(start, objects);

        return null;
    }
}
