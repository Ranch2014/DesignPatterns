package factory.abstractFactory;

/**
 * Created by jaxer on 5/25/16.
 * 前端具体子类
 */
public class JuniorClient implements Client {

    @Override
    public void doClient() {
        System.out.println("I'm a junior client.");
    }
}
