package factory.abstractFactory;

/**
 * Created by jaxer on 5/25/16.
 * 后端具体子类
 */
public class JuniorServer implements Server {

    @Override
    public void doServer() {
        System.out.println("I'm a junior server.");
    }
}
