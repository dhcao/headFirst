package strategyPattern.behavior;

/**
 * Created by KEY on 2018/3/4.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("这只鸭子呱呱叫");
    }
}
