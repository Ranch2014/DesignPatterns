package proxy.dynamicProxy;

/**
 * Created by jaxer on 5/27/16.
 */
public class AOP implements AOPInterface {

    @Override
    public void addBefore(String str) {
        System.out.println(str + "(调用前)");
    }

    @Override
    public void addAfter(String str) {
        System.out.println(str + "(调用后)");
    }
}
