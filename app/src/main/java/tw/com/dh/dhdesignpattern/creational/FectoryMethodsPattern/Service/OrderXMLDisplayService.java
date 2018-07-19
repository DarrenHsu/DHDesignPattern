package tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service;

import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.OrderXMLParser;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.XMLParser;

public class OrderXMLDisplayService extends DisplayService {
    @Override
    public XMLParser getParser() {
        return new OrderXMLParser();
    }
}
