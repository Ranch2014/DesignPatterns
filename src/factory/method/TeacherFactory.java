package factory.method;

/**
 * Created by jaxer on 5/25/16.
 * 工厂子类2:教师工厂
 */
public class TeacherFactory implements JobFactory {

    public static final int CHINESE = 1;
    public static final int MATH = 2;

    @Override
    public Job createJob(int type) {
        if (type == 1) {
            return new ChineseTeacher();
        } else if (type == 2) {
            return new MathTeacher();
        }
        return null;
    }
}
