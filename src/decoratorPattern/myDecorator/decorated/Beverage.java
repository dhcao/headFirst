package decoratorPattern.myDecorator.decorated;

/**
 * 抽象类
 * Created by KEY on 2018/3/8.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
