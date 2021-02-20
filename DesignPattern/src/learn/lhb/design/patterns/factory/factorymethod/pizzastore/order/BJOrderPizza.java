package learn.lhb.design.patterns.factory.factorymethod.pizzastore.order;

import learn.lhb.design.patterns.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import learn.lhb.design.patterns.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import learn.lhb.design.patterns.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @Description  北京披萨订购类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 22:35
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
