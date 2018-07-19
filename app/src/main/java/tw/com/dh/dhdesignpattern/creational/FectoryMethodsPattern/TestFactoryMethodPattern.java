package tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.XMLParser;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service.DisplayService;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service.ErrorXMLDisplayService;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service.FeedbackXMLDisplayService;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service.OrderXMLDisplayService;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service.ResponseXMLDisplayService;

public class TestFactoryMethodPattern {
    public static void test() {
        DisplayService service = new ErrorXMLDisplayService();
        XMLParser parser = service.getParser();
        Log.d(AppConstant.APP_TAG, parser.parse());

        service = new ResponseXMLDisplayService();
        parser = service.getParser();
        Log.d(AppConstant.APP_TAG, parser.parse());

        service = new FeedbackXMLDisplayService();
        parser = service.getParser();
        Log.d(AppConstant.APP_TAG, parser.parse());

        service = new OrderXMLDisplayService();
        parser = service.getParser();
        Log.d(AppConstant.APP_TAG, parser.parse());
    }
}
