package factory.simple;

/**
 * Created by jaxer on 5/25/16.
 * 工厂类
 */
public class JobFactory {
    /** 定义常量 */
    public static final int PROGRAMMER = 1;

    public static final int TEACHER = 2;

    public static Job createJob(int identity) {
        if (identity == PROGRAMMER) {
            return new Programmer();
        } else if (identity == TEACHER) {
            return new Teacher();
        } else {
            return null;
        }
    }
}
