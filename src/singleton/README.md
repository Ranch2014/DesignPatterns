#单例模式
定义:  
>The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.  
单例模式确保一个类只有一个实例，并提供一个全局访问点。

为什么需要单例模式：  
有些对象只需要一个，比如线程池、对话框、缓存、注册表、日志等。  
而且这类对象只能有一个实例，若制造多个实例，会导致许多问题，例如：程序行为异常，资源使用过量，或者是不一致的结果。

##经典的单例模式
(代码参见 classic 目录下的文件.)    
可能出现的问题:  
若有多个线程执行 `getInstance()` 方法，则会带来线程安全问题，即可能实例化多个对象。  
解决方法：使用同步（`synchronized`）即下面的线程安全的单例模式。

##线程安全的单例模式
(代码参见 threadsafe 目录下的文件.)  
同步带来的问题：性能降低。  
而且只有第一次执行方法时，才真正需要同步。一旦设置好 uniqueInstance 后就不再需要同步这个方法了。

解决方法:  
1) 若对性能无特别要求，不作处理.  
2) 改“延迟”实例化为“急切”实例化.示例代码:  

``` java
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    //加同步锁 (关键字 synchronized)
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
```

3) 使用双重检查加锁

##双重检查加锁的单例模式
代码参见 dlc 目录下的文件.