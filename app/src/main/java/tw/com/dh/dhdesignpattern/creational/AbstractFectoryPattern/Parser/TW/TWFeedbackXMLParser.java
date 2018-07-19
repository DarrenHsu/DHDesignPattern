package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.TW;

import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.XMLParser;

public class TWFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "TW Feedback XML Message";
    }
}
