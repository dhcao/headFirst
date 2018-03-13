package decoratorPattern;

import decoratorPattern.myDecorator.decorate.Mocha;
import decoratorPattern.myDecorator.decorate.Whip;
import decoratorPattern.myDecorator.decorated.Beverage;
import decoratorPattern.myDecorator.decorated.Espresso;
import decoratorPattern.myDecorator.decorated.HouseBlend;

/**
 * Created by KEY on 2018/3/8.
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
    }
}
