package decorator;

/**
 * Created by jaxer on 05/10/2016.
 * 客户端(测试类)
 */
public class Client {
    public static void main(String[] args) {
        Hamburger hamburger = new ChickenBurger();
        System.out.println(hamburger.getName() + ", 价格: " + hamburger.getPrice());

        Lettuce lettuce = new Lettuce(hamburger);
        System.out.println(lettuce.getName() + ", 价格: " + lettuce.getPrice());

        Chilli chilli = new Chilli(hamburger);
        System.out.println(chilli.getName() + ", 价格: " + chilli.getPrice());

        Chilli chilli2 = new Chilli(lettuce);
        System.out.println(chilli2.getName() + ", 价格: " + chilli2.getPrice());
    }
}
