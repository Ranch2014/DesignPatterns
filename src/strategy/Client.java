package strategy;

/**
 * Created by jaxer on 10/4/16.
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Context context; //创建环境
        context = new Context(new ConcreteIStrategyA()); //策略A
        context.execute();

        context = new Context(new ConcreteIStrategyB()); //更改策略
        context.execute();
    }
}
