package learn.lhb.design.patterns.factory.absfactory.pizzastore.order;

import learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Description  北京披萨店工厂类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/20
 * @time 14:19
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
