package learn.lhb.design.patterns.factory.factorymethod.pizzastore.order;

/**
 * @Description  披萨店
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 22:40
 */
public class PizzaStore {
    public static void main(String[] args) {
        // 创建北京口味的披萨
        new BJOrderPizza();

        // 创建伦敦口味的披萨
//        new LDOrderPizza();
    }
}
