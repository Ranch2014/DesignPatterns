package command;

/**
 * Created by jaxer on 5/26/16.
 * 命令调用者
 */
public class Invoker {
    private Command command;

    public void setCommand(Command c) {
        command = c;
    }

    public void handleCommand() {
        command.execute();
    }
}
