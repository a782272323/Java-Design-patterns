package learn.lhb.design.patterns.factory.simplefactory.pizzastore.order;

/**
 * @Description  披萨店(相当于一个客户端，发出披萨订购任务)
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 14:55
 */
public class PizzaStore {
    public static void main(String[] args) {
        // 传统模式
//        new OrderPizza();

        // 使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println(" 退出程序～");

        // 使用静态工厂模式
        new OrderPizza2();
        System.out.println(" 退出程序～");
    }
}
