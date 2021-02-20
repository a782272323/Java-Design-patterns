package learn.lhb.design.patterns.factory.absfactory.pizzastore.order;

import learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Description  披萨抽象工厂接口类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/20
 * @time 14:17
 */
public interface AbsFactory {

    /**
     * 制作披萨抽象方法，让工厂子类实现
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);
}
