package singleton.classic;

/**
 * Created by jaxer on 5/30/16.
 * 经典的单例模式
 */
public class Singleton {
    private static Singleton uniqueInstance;

    //注意构造方法是私有的
    private Singleton() {}

    public static Singleton getInstance() {
        //这里使用了延迟实例化 (即,用到的时候再进行初始化,而非声明的时候,又称"懒汉式")
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a classic Singleton";
    }
}
