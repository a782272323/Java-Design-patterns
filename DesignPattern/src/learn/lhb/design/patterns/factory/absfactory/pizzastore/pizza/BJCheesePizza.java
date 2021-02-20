package learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza;

/**
 * @Description  北京奶酪披萨类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 22:25
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println(" 给北京奶酪披萨准备原材料");
    }
}
