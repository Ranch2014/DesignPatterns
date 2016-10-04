package strategy;

/**
 * Created by jaxer on 10/4/16.
 * 具体策略A (包装了相关的算法或行为)
 */
public class ConcreteIStrategyA implements IStrategy {

    @Override
    public void doSomething() {
        System.out.println("具体策略A");
    }
}
