package strategyPattern.studyDemo.behavior;

/**
 * Created by KEY on 2018/3/4.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("神奇的鸭子用翅膀飞");
    }
}
