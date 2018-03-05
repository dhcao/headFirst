package strategyPattern.studyDemo;

import strategyPattern.studyDemo.behavior.FlyWithWings;
import strategyPattern.studyDemo.duck.Duck;
import strategyPattern.studyDemo.duck.MallardDuck;

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
