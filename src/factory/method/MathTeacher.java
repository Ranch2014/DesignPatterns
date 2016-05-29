package factory.method;

/**
 * Created by jaxer on 5/25/16.
 * 具体产品子类2
 */
public class MathTeacher implements Job {
    @Override
    public void work() {
        System.out.println("I'm a math teacher.\n");
    }
}
