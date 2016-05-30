package singleton.dcl;

/**
 * Created by jaxer on 5/30/16.
 * 使用双重检查加锁的单例模式
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    /**
     * 检查实例，若不存在，就进入同步区块。进入区块后，再检查一次。若仍是null，才创建实例。
     * 注意：只有第一次才彻底执行这里的代码.
     * @return
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
