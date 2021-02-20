package learn.lhb.design.patterns.factory.factorymethod.pizzastore.order;

import learn.lhb.design.patterns.factory.factorymethod.pizzastore.pizza.*;

/**
 * @Description  伦敦披萨订购类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 22:39
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
