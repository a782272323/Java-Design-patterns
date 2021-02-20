package learn.lhb.design.patterns.factory.simplefactory.pizzastore.order;

import learn.lhb.design.patterns.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description  使用静态工厂模式
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 19:58
 */
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    /**
     * 构造器
     */
    public OrderPizza2() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            // 输出 pizza 制作过程
            // 订购成功
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败.");
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
