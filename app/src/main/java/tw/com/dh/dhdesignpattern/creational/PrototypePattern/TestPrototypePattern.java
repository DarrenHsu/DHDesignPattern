package tw.com.dh.dhdesignpattern.creational.PrototypePattern;

import android.util.Log;

import java.util.Date;

import tw.com.dh.constant.AppConstant;

public class TestPrototypePattern {
    public static void test() {
        try {
            Sheep s1 = new Sheep("a1", new Date(12344659843L));
            Sheep s2 = s1.clone();
            Log.d(AppConstant.APP_TAG, "s1" + s1.toString());
            Log.d(AppConstant.APP_TAG, "s2" + s2.toString());
            s1.setBirthday(new Date(134637859L));
            Log.d(AppConstant.APP_TAG, "s1" + s1.toString());
        } catch (CloneNotSupportedException e) {
            Log.e(AppConstant.APP_TAG, e.getLocalizedMessage());
        }
    }
}
