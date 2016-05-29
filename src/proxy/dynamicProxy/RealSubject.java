package proxy.dynamicProxy;

/**
 * Created by jaxer on 5/27/16.
 * 真正的对象
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("真正对象的操作");
    }
}
