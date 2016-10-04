package observer.pull;

/**
 * Created by jaxer on 10/4/16.
 * 具体的观察者
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        String state = ((ConcreteSubject)subject).getState();
        System.out.println(name + " update new state " + state);
    }
}
