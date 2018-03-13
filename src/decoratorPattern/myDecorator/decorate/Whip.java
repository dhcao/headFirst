package decoratorPattern.myDecorator.decorate;

import decoratorPattern.myDecorator.decorated.Beverage;

/**
 * Created by KEY on 2018/3/8.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return 0.10+beverage.cost();
    }
}
