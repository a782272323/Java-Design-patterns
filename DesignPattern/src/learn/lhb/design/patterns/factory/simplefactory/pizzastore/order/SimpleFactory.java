package learn.lhb.design.patterns.factory.simplefactory.pizzastore.order;

import learn.lhb.design.patterns.factory.simplefactory.pizzastore.pizza.GreekPizza;
import learn.lhb.design.patterns.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Description  简单工厂模式-订购披萨的简单工厂类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 19:43
 */
public class SimpleFactory {

    /**
     * 根据orderType 返回披萨对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        System.out.println("使用简单工厂模式.");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new GreekPizza();
            pizza.setName(" 奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new GreekPizza();
            pizza.setName(" 胡椒披萨");
        }
        return pizza;
    }

    /**
     * 简单工厂模式 也叫 静态工厂模式
     * @param orderType
     * @return
     */
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式.");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new GreekPizza();
            pizza.setName(" 奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new GreekPizza();
            pizza.setName(" 胡椒披萨");
        }
        return pizza;
    }
}
