package proxy.staticProxy;

/**
 * Created by jaxer on 5/27/16.
 * 代理类
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    public ProxySubject() {
        realSubject = new RealSubject();
    }

    @Override
    public void doSomething() {
        System.out.println("这是代理对象添加的功能");
        realSubject.doSomething();
        System.out.println("这也是代理对象添加的功能");
    }
}
