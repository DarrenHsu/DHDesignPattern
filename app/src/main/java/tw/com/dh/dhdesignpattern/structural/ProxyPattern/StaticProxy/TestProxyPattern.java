package tw.com.dh.dhdesignpattern.structural.ProxyPattern.StaticProxy;

import tw.com.dh.dhdesignpattern.structural.ProxyPattern.StaticProxy.Proxy.ProxyStar;
import tw.com.dh.dhdesignpattern.structural.ProxyPattern.StaticProxy.Subject.RealStar;
import tw.com.dh.dhdesignpattern.structural.ProxyPattern.StaticProxy.Subject.Star;

public class TestProxyPattern {
    public static void test() {
        Star realStart = new RealStar();
        Star proxyStart = new ProxyStar(realStart);

        proxyStart.confer();
        proxyStart.bookTicket();
        proxyStart.sing();
        proxyStart.signContract();
        proxyStart.collectMoney();
    }

}
