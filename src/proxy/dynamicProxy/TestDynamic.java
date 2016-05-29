package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by jaxer on 5/27/16.
 * 测试类(动态代理)
 */
public class TestDynamic {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), new AOPInvocationHandler(subject));
        proxy.doSomething();
    }
}
