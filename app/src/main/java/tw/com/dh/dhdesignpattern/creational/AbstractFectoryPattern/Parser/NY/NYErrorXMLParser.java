package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.NY;

import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.XMLParser;

public class NYErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NY Error XML Message";
    }
}
