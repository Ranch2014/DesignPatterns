package observer.push;

/**
 * Created by jaxer on 10/4/16.
 * 具体的被观察者
 */
public class ConcreteSubject extends Subject {

    /** 状态位 */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.notifyObservers(state); //通知所有的观察者
    }

}
