package tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service;

import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.ResponseXMLParser;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.XMLParser;

public class ResponseXMLDisplayService extends DisplayService {
    @Override
    public XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
