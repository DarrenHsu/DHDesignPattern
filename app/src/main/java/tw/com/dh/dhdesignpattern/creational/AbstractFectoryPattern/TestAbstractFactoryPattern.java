package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Fectory.AbstractParserFactory;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Fectory.ParserFactoryProducer;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.XMLParser;

public class TestAbstractFactoryPattern {
    public static void test() {
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NY");
        XMLParser parser = parserFactory.getParserInstance("ORDER");
        Log.d(AppConstant.APP_TAG, parser.parse());

        parserFactory = ParserFactoryProducer.getFactory("TW");
        parser = parserFactory.getParserInstance("FEEDBACK");
        Log.d(AppConstant.APP_TAG, parser.parse());
    }
}
