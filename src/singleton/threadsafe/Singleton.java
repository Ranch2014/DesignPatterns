package singleton.threadsafe;

/**
 * Created by jaxer on 5/30/16.
 * 线程安全的单例模式
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    /**
     * 使用同步锁 (关键字 synchronized)
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
