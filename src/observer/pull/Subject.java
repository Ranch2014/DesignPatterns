package observer.pull;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jaxer on 10/4/16.
 * 被观察者父类
 */
public abstract class Subject {

    /**
     * 保存观察者
     */
    private List<Observer> observers = new LinkedList<>();

    /**
     * 添加观察者
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 移除观察者
     */
    public void detach(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    /**
     * 通知观察者
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
