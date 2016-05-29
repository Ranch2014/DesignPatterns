package command;

/**
 * Created by jaxer on 5/26/16.
 * 命令子类
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver r) {
        receiver = r;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
