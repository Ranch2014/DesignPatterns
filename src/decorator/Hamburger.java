package decorator;

/**
 * Created by jaxer on 05/10/2016.
 * 汉堡父类
 */
public abstract class Hamburger {

    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
