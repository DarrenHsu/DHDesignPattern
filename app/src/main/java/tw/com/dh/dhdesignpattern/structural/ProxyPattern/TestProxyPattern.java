package tw.com.dh.dhdesignpattern.structural.ProxyPattern;

import tw.com.dh.dhdesignpattern.structural.ProxyPattern.Proxy.ProxyStar;
import tw.com.dh.dhdesignpattern.structural.ProxyPattern.Subject.RealStar;
import tw.com.dh.dhdesignpattern.structural.ProxyPattern.Subject.Star;

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
