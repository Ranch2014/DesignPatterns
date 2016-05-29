package factory.simple;

/**
 * Created by jaxer on 5/25/16.
 * 产品的具体子类2
 */
public class Programmer implements Job {
    @Override
    public void work() {
        System.out.println("I'm programming ...");
    }
}
