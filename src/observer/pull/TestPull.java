package observer.pull;

import java.io.Reader;

/**
 * Created by jaxer on 10/4/16.
 * push 模式测试类
 */
public class TestPull {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject(); //创建观察对象
        ConcreteObserver observer1 = new ConcreteObserver("Jack"); //创建观察者1
        ConcreteObserver observer2 = new ConcreteObserver("Rose"); //创建观察者2

        subject.attach(observer1); //添加观察者
        subject.attach(observer2);

        subject.setState("一起跳海啊!"); //改变状态

        subject.detach(observer2); //移除观察者

        subject.setState("我先跳了");
    }
}
