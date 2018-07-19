package tw.com.dh.dhdesignpattern.creational.FectoryMethodsPattern.Parser;

public class ErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "Error XML Message";
    }
}
