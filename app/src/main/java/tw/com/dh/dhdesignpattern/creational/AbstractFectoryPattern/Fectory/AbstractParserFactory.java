package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Fectory;

import tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Parser.XMLParser;

public interface AbstractParserFactory {
    XMLParser getParserInstance(String parserType);
}
