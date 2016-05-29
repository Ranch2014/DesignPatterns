package factory.abstractFactory;

/**
 * Created by jaxer on 5/25/16.
 * 团队工厂具体子类
 */
public class JuniorTeamFactory implements TeamFactory {

    @Override
    public Client creacteClient() {
        return new JuniorClient();
    }

    @Override
    public Server createServer() {
        return new JuniorServer();
    }
}
