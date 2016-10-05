package decorator;

/**
 * Created by jaxer on 05/10/2016.
 * 装饰者1
 */
public class Lettuce extends Condiment {

    Hamburger hamburger;

    public Lettuce(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName() + ", 加生菜";
    }

    @Override
    public double getPrice() {
        return hamburger.getPrice() + 1.5;
    }
}
