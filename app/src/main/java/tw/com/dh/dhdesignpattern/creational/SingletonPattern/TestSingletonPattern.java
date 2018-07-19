package tw.com.dh.dhdesignpattern.creational.SingletonPattern;

public class TestSingletonPattern {
    public static void test() {
        SingletonEager eager = SingletonEager.getInstance();
        eager.run();

    }
}
