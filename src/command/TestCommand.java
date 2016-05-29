package command;

/**
 * Created by jaxer on 5/26/16.
 * 测试类
 */
public class TestCommand {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.handleCommand();
    }
}
