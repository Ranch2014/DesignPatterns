package decorator;

/**
 * Created by jaxer on 05/10/2016.
 * 装饰者2
 */
public class Chilli extends Condiment {

    Hamburger hamburger;

    public Chilli(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName() + ", 加辣椒";
    }

    @Override
    public double getPrice() {
        return hamburger.getPrice() + 0; //辣椒免费
    }
}
