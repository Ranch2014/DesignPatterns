package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jaxer on 5/27/16.
 * 代理行为 (用到反射机制)
 */
public class AOPInvocationHandler implements InvocationHandler {

    private AOPInterface aopInterface;
    private Object realObject;

    public AOPInvocationHandler(Object object) {
        aopInterface = new AOP();
        realObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        method.invoke(proxy);
        aopInterface.addBefore(realObject.getClass().getName() + " 类的 " + method.getName() + "方法 ");
        Object obj = method.invoke(realObject);
        aopInterface.addAfter(realObject.getClass().getName() + " 类的 " + method.getName() + "方法 ");

        return obj;
    }
}
