package factory.simple;

/**
 * Created by jaxer on 5/25/16.
 * 产品的具体子类
 */
public class Teacher implements Job {
    @Override
    public void work() {
        System.out.println("I'm teaching ...");
    }
}
