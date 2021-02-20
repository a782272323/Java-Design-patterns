package learn.lhb.design.patterns.factory.absfactory.pizzastore.order;

import learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description  订购披萨类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/20
 * @time 14:22
 */
public class OrderPizza {

    AbsFactory absFactory;

    /**
     * 构造器
     */
    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }


    public void setFactory(AbsFactory factory) {
        System.out.println(" 使用抽象工厂模式～");
        Pizza pizza = null;
        // 用户输入
        String orderType = "";
        this.absFactory = factory;
        do {
            orderType = getType();
            // 可能是北京披萨的工厂子类，也可能是伦敦披萨的工厂子类
            pizza = factory.createPizza(orderType);
            // 判断是否订购成功
            if (pizza != null) {
                // 输出披萨制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败!");
                break;
            }

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
