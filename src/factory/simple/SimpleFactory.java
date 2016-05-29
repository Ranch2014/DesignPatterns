package factory.simple;

/**
 * Created by jaxer on 5/25/16.
 * 工厂模式有三种：简单工厂模式、工厂方法模式、抽象工厂模式
 * 测试类 (简单工厂)
 */
public class SimpleFactory {
    public static void main(String[] args) {
        System.out.println("创建程序员:");
        Job job = JobFactory.createJob(JobFactory.PROGRAMMER);
        job.work();

        System.out.println("创建教师:");
        job = JobFactory.createJob(JobFactory.TEACHER);
        job.work();
    }
}
