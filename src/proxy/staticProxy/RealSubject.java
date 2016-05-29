package proxy.staticProxy;

/**
 * Created by jaxer on 5/27/16.
 * 真正对象
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("这是真正对象的操作");
    }
}
