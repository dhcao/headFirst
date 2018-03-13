package decoratorPattern.myDecorator.decorated;

/**
 * 其中一种饮料
 * Created by KEY on 2018/3/8.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
