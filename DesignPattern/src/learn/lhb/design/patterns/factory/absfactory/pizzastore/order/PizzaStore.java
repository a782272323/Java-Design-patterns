package learn.lhb.design.patterns.factory.absfactory.pizzastore.order;

/**
 * @Description  披萨店
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/20
 * @time 14:26
 */
public class PizzaStore {
    public static void main(String[] args) {

        new OrderPizza(new BJFactory());


    }
}
