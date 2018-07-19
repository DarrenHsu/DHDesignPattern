package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Fectory;

import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.NY.NYErrorXMLParser;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.NY.NYFeedbackXMLParser;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.NY.NYOrderXMLParser;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.NY.NYResponseXMLParser;
import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.XMLParser;

public class NYParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "ERROR": return new NYErrorXMLParser();
            case "FEEDBACK": return new NYFeedbackXMLParser();
            case "ORDER": return new NYOrderXMLParser();
            case "RESPONSE": return new NYResponseXMLParser();
            default: return null;
        }
    }
}
