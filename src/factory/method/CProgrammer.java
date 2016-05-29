package factory.method;

/**
 * Created by jaxer on 5/25/16.
 * 产品的具体子类3
 */
public class CProgrammer implements Job {
    @Override
    public void work() {
        System.out.println("I'm a C programmer.\n");
    }
}
