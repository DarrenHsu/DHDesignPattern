package tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Service;

import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.ErrorXMLParser;
import tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser.XMLParser;

public class ErrorXMLDisplayService extends DisplayService {
    @Override
    public XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
