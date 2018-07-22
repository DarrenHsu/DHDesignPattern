package tw.com.dh.dhdesignpattern.behavioral.TemplateMethodPattern;

import tw.com.dh.dhdesignpattern.behavioral.TemplateMethodPattern.TemplateMethod.DrawMoney;

public class TestTemplateMethodPattern {
    public static void test() {
        DrawMoney drawMoney = new DrawMoney();
        drawMoney.process();
    }
}
