package factoryPattern;

import factoryPattern.Pizza.Pizza;

/**
 * Created by KEY on 2018/3/13.
 */
public class PizzaStore {
        SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderpizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
