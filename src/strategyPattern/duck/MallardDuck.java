package strategyPattern.duck;

import strategyPattern.behavior.FlyWithNothing;
import strategyPattern.behavior.Quack;

/**
 * Created by KEY on 2018/3/4.
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithNothing();
    }

    @Override
    public void display(){
        System.out.println("长得好像一只Mallard鸭子");
    }


}
