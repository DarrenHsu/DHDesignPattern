package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.TW;


import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.XMLParser;

public class TWResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "TW Response XML Message";
    }
}
