package strategyPattern.studyDemo.duck;

import strategyPattern.studyDemo.behavior.FlyBehavior;
import strategyPattern.studyDemo.behavior.QuackBehavior;

/**
 * Created by KEY on 2018/3/4.
 */
public class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    //    public void quack(){
//        System.out.println("鴨子呱呱叫");
//    }
    public void display(){
        System.out.println("鴨子都長這樣");
    }

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }


}
