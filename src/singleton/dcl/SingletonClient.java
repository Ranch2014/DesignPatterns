package singleton.dcl;

/**
 * Created by jaxer on 5/30/16.
 * 双重检查加锁的单例模式测试类
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
