package decoratorPattern.myDecorator.decorate;

import decoratorPattern.myDecorator.decorated.Beverage;

/**
 * Created by KEY on 2018/3/8.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
