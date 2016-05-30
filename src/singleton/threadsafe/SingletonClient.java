package singleton.threadsafe;

/**
 * Created by jaxer on 5/30/16.
 * 线程安全的大力模式测试类
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
