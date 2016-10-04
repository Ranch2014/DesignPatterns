package strategy;

/**
 * Created by jaxer on 10/4/16.
 * 上下文(环境)接口
 */
public class Context {
    private IStrategy IStrategy;

    public Context(IStrategy IStrategy) {
        this.IStrategy = IStrategy;
    }

    public void execute() {
        IStrategy.doSomething();
    }
}
