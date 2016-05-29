package factory.method;

/**
 * Created by jaxer on 5/25/16.
 * 工厂子类1:程序员工厂
 */
public class ProgrammerFactory implements JobFactory {

    public static final int C = 1;
    public static final int JAVA = 2;

    @Override
    public Job createJob(int type) {
        if (type == 1) {
            return new CProgrammer();
        } else if (type == 2) {
            return new JavaProgrammer();
        }
        return null;
    }
}
