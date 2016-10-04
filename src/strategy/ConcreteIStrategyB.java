package strategy;

/**
 * Created by jaxer on 10/4/16.
 * 策略B (包装了相关的算法或行为)
 */
public class ConcreteIStrategyB implements IStrategy {

    @Override
    public void doSomething() {
        System.out.println("具体策略B");
    }
}
