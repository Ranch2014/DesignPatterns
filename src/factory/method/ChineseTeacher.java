package factory.method;

/**
 * Created by jaxer on 5/25/16.
 * 产品的具体子类1
 */
public class ChineseTeacher implements Job {
    @Override
    public void work() {
        System.out.println("I'm a Chinese teacher.\n");
    }
}
