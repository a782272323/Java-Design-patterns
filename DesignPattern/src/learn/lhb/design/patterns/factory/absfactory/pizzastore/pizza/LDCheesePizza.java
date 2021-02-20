package learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza;

/**
 * @Description  伦敦奶酪披萨类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 22:27
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println(" 给伦敦奶酪披萨准备原材料");
    }
}
