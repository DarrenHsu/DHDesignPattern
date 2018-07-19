package tw.com.dh.dhdesignpattern.creational.AbstractFectoryPattern.Fectory;

public class ParserFactoryProducer {
    public static AbstractParserFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "NY": return new NYParserFactory();
            case "TW": return new TWParserFactory();
            default: return null;
        }
    }
}
