package decoratorPattern.myDecorator.decorate;

import decoratorPattern.myDecorator.decorated.Beverage;

/**
 * 装饰者，要能取代Beverage
 * Created by KEY on 2018/3/8.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
