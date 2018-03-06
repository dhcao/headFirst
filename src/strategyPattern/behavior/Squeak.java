package strategyPattern.behavior;

/**
 * Created by KEY on 2018/3/4.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("这只鸭子竟然吱吱叫！老鼠鸭？" );
    }
}
