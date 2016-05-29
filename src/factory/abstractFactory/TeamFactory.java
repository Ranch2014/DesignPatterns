package factory.abstractFactory;

/**
 * Created by jaxer on 5/25/16.
 * 团队工厂接口
 */
public interface TeamFactory {
    /**
     * 创建客户端,如果有多个对象选择,这里可以添加参数,子类中根据具体的参数返回对应的对象
     */
    public Client creacteClient();

    /**
     * 创建服务端,如果有多个对象选择,这里可以添加参数,子类中根据具体的参数返回对应的对象
     */
    public Server createServer();
}
