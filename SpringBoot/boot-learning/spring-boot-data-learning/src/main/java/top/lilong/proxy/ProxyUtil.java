package top.lilong.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    public static  Star createStarProxy(BidStar bidStar){

      Star star=  (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                if ("sing".equals(method.getName())){
                    System.out.println("准备唱歌，收钱");
                }else if ("dance".equals(method.getName())){
                    System.out.println("准备跳舞，收钱");
                }
                return method.invoke(bidStar,args);


            }
        });
    return star;
    }
}
