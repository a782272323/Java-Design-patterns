package learn.lhb.design.patterns.factory.simplefactory.pizzastore.order;

import learn.lhb.design.patterns.factory.simplefactory.pizzastore.pizza.CheesePizza;
import learn.lhb.design.patterns.factory.simplefactory.pizzastore.pizza.GreekPizza;
import learn.lhb.design.patterns.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description  订购披萨
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 14:48
 */
public class OrderPizza {

    /**
     * 构造器
     */
//    public OrderPizza() {
//        // 初始化披萨
//        Pizza pizza = null;
//        // 订购的披萨种类
//        String orderType;
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                // 订购希腊披萨
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//
//            } else if (orderType.equals("cheese")) {
//                // 订购奶酪披萨
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            } else if (orderType.equals("pepper")) {
//                // 订购胡椒披萨
//                pizza = new CheesePizza();
//                pizza.setName("胡椒披萨");
//            } else {
//                break;
//            }
//            // 输出 pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    /**
     * 定义一个简单工厂对象
     */
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    /**
     * 构造器
     */
    public OrderPizza (SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {

        String orderType = "";
        // 设置简单工厂对象
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
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
