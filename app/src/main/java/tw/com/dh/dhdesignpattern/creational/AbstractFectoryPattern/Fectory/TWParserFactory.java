package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Fectory;

import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.TW.TWErrorXMLParser;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.TW.TWFeedbackXMLParser;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.TW.TWOrderXMLParser;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.TW.TWResponseXMLParser;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.XMLParser;

public class TWParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "ERROR": return new TWErrorXMLParser();
            case "FEEDBACK": return new TWFeedbackXMLParser();
            case "ORDER": return new TWOrderXMLParser();
            case "RESPONSE": return new TWResponseXMLParser();
            default: return null;
        }
    }
}
