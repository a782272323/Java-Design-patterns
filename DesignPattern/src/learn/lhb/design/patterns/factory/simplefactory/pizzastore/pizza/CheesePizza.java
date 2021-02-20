package learn.lhb.design.patterns.factory.simplefactory.pizzastore.pizza;

/**
 * @Description 奶酪披萨
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 14:46
 */
public class CheesePizza extends Pizza {

    /**
     * 实现
     */
    @Override
    public void prepare() {
        System.out.println(" 给职责奶酪披萨准备原材料");
    }
}
