package tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service;

import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.FeedbackXMLParser;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.XMLParser;

public class FeedbackXMLDisplayService extends DisplayService {
    @Override
    public XMLParser getParser() {
        return new FeedbackXMLParser();
    }
}
