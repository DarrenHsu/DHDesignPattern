package tw.com.dh.dhdesignpattern.structural.FlyweightPattern.FlyweightFactory;

import java.util.HashMap;
import java.util.Map;

import tw.com.dh.dhdesignpattern.structural.FlyweightPattern.Flyweight.ChessFlyweight;
import tw.com.dh.dhdesignpattern.structural.FlyweightPattern.Flyweight.ConcreteChess;

public class ChessFlyweightFactory {
    private Map<String, ChessFlyweight> map = new HashMap<>();

    public ChessFlyweight getChess(String color) {
        ChessFlyweight chessFlyweight = map.get(color);
        if (chessFlyweight == null) {
            chessFlyweight = new ConcreteChess(color);
            map.put(color, chessFlyweight);
        }
        return chessFlyweight;
    }

}
