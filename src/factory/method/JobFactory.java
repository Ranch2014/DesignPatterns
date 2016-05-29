package factory.method;

/**
 * Created by jaxer on 5/25/16.
 * 工厂接口
 */
public interface JobFactory {
    public Job createJob(int type);
}
