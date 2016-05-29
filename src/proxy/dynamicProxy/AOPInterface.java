package proxy.dynamicProxy;

/**
 * Created by jaxer on 5/27/16.
 * 切面接口 (AOP: Aspect Oriented Programming, 面向切面编程)
 */
public interface AOPInterface {
    public void addBefore(String str);

    public void addAfter(String str);
}
