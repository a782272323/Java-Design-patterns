package learn.lhb.design.patterns.factory.absfactory.pizzastore.order;

import learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza.*;

/**
 * @Description  伦敦披萨工厂子类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/20
 * @time 14:20
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
