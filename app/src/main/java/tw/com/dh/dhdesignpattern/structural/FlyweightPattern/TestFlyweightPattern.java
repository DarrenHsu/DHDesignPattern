package tw.com.dh.dhdesignpattern.structural.FlyweightPattern;

import tw.com.dh.dhdesignpattern.structural.FlyweightPattern.Flyweight.ChessFlyweight;
import tw.com.dh.dhdesignpattern.structural.FlyweightPattern.Flyweight.ConcreteChess;
import tw.com.dh.dhdesignpattern.structural.FlyweightPattern.Flyweight.Cordinate;
import tw.com.dh.dhdesignpattern.structural.FlyweightPattern.FlyweightFactory.ChessFlyweightFactory;

public class TestFlyweightPattern {
    public static void test() {
        ChessFlyweightFactory factory = new ChessFlyweightFactory();
        ChessFlyweight chess1 = factory.getChess("#000000");
        ChessFlyweight chess2 = factory.getChess("#ffffff");
        ChessFlyweight chess3 = factory.getChess("#000000");

        chess1.display(new Cordinate(1,1));
        chess2.display(new Cordinate(0,0));
        chess3.display(new Cordinate(0,1));
    }
}
