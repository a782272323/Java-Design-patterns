package learn.lhb.design.patterns.factory.factorymethod.pizzastore.order;


import learn.lhb.design.patterns.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description  订购披萨
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 14:48
 */
public abstract class OrderPizza {

    /**
     * 定义一个抽象方法，createPizza，让各个工厂子类自己实现
     * @param orderType
     * @return
     */
    abstract Pizza createPizza(String orderType);

    /**
     * 构造器
     */
    public OrderPizza() {
        Pizza pizza = null;
        // 订购披萨的类型
        String orderType;
        do {
            orderType = getType();
            // 抽象方法，根据工厂子类完成
            pizza = createPizza(orderType);
            // 输出披萨制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    /**
     * 获取客户订购的披萨种类
     * @return
     */
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("客户订购的披萨种类 : ");
            String string = bufferedReader.readLine();
            return string;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
