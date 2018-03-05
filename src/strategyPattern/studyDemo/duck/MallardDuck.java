package strategyPattern.studyDemo.duck;

import strategyPattern.studyDemo.behavior.FlyWithNothing;
import strategyPattern.studyDemo.behavior.FlyWithWings;
import strategyPattern.studyDemo.behavior.Quack;

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
