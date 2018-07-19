package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.NY;

import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.XMLParser;

public class NYFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NY Feedback XML Message";
    }
}
