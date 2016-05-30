package factory.abstractFactory;

/**
 * Created by jaxer on 5/25/16.
 * 抽象工厂测试类
 */
public class AbstractFactory {
    public static void main(String[] args) {
        System.out.println("我要创建一个初级团队，包括一个初级前端，一个初级服务端:");
        TeamFactory tf = new JuniorTeamFactory();
        Client client = tf.createClient();
        Server server = tf.createServer();
        client.doClient();
        server.doServer();
    }
}
