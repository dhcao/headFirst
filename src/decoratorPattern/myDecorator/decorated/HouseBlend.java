package decoratorPattern.myDecorator.decorated;

/**
 * 这啥咖啡来着
 * Created by KEY on 2018/3/8.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
