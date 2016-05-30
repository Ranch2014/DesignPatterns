package singleton.classic;

/**
 * Created by jaxer on 5/30/16.
 * 经典单例模式的测试类
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
