package tw.com.dh.dhdesignpattern.structural.ProxyPattern.DynamicProxy;

import java.lang.reflect.Proxy;

import tw.com.dh.dhdesignpattern.structural.ProxyPattern.DynamicProxy.Subject.RealStar;
import tw.com.dh.dhdesignpattern.structural.ProxyPattern.DynamicProxy.Subject.Star;

public class TestProxyPattern {
    public static void test() {
        Star star = new RealStar();
        StarHandler handler = new StarHandler(star);
        Star proxy = (Star)Proxy.newProxyInstance(getClassLoader(), new Class[]{Star.class}, handler);
        proxy.sing();
        proxy.bookTicket();
    }

    public static ClassLoader getClassLoader() {
        return new TestProxyPattern().getClass().getClassLoader();
    }
}
