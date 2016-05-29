package factory.method;

/**
 * Created by jaxer on 5/25/16.
 * 工厂方法测试类
 */
public class FactoryMethod {
    public static void main(String[] args) {
        System.out.println("请创建一个Java程序员:");
        JobFactory jf = new ProgrammerFactory();
        Job job = jf.createJob(ProgrammerFactory.JAVA);
        job.work();

        System.out.println("请创建一个C程序员:");
        job = jf.createJob(ProgrammerFactory.C);
        job.work();

        jf = new TeacherFactory();
        System.out.println("请创建一个语文老师:");
        job = jf.createJob(TeacherFactory.CHINESE);
        job.work();

        System.out.println("请创建一个数学老师:");
        job = jf.createJob(TeacherFactory.MATH);
        job.work();
    }
}
