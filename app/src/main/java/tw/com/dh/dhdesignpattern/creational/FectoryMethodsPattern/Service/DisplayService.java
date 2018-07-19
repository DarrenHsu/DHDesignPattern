package tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service;

import android.util.Log;

import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.XMLParser;

import static tw.com.dh.constant.AppConstant.APP_TAG;

public abstract class DisplayService {
    public void display() {
        XMLParser parser = getParser();
        String message = parser.parse();
        Log.d(APP_TAG, message);
    }

    public abstract XMLParser getParser();
}
