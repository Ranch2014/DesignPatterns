package observer.pull;

/**
 * Created by jaxer on 10/4/16.
 * pull模式观察者接口
 */
public interface Observer {

    /**
     * 更新状态
     */
    public void update(Subject subject);
}
