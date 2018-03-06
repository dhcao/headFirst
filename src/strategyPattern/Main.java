package strategyPattern;

import strategyPattern.duck.MallardDuck;
import strategyPattern.behavior.FlyWithWings;
import strategyPattern.duck.Duck;

/**
 * Created by KEY on 2018/3/4.
 */
public class Main{
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
        duck.performQuack();
    }
}
