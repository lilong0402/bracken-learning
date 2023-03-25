package top.lilong.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        BidStar star = new BidStar("hhh");

        Star starProxy = ProxyUtil.createStarProxy(star);
        String sing = starProxy.sing();
        System.out.println(sing);

        starProxy.dance();
//        System.out.println();
    }
}
