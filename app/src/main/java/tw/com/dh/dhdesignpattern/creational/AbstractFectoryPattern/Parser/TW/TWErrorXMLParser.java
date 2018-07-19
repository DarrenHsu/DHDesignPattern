package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.TW;

import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.XMLParser;

public class TWErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "TW Error XML Message";
    }
}
