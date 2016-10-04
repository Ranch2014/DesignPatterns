package observer.push;

/**
 * Created by jaxer on 10/4/16.
 * 测试类
 */
public class TestPush {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject(); //创建被观察者
        Observer observer1 = new ConcreteObserver("张三"); //创建被观察者1
        Observer observer2 = new ConcreteObserver("李四"); //创建被观察者2
        subject.attach(observer1); //添加
        subject.attach(observer2);

        System.out.println("准备……");
        subject.setState("上班了"); //改变状态

        subject.setState("下班了");

        subject.detach(observer2); //移除观察者李四

        subject.setState("上班了");
    }

}
