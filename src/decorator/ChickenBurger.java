package decorator;

/**
 * Created by jaxer on 05/10/2016.
 * 被装饰者
 */
public class ChickenBurger extends Hamburger {

    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
