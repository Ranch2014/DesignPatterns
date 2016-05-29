package proxy.staticProxy;

/**
 * Created by jaxer on 5/27/16.
 * 测试类(静态代理)
 */
public class TestStatic {
    public static void main(String[] args) {
        ProxySubject subject = new ProxySubject();
        subject.doSomething();
    }
}
