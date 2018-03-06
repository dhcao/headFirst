package strategyPattern.behavior;

/**
 * Created by KEY on 2018/3/4.
 */
public class FlyWithNothing implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("真正的鸭子不要翅膀也能飞，随便飞！");
    }
}
