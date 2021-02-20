package learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza;

/**
 * @Description  北京胡椒披萨类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 22:27
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println(" 给北京胡椒披萨准备原材料");
    }
}
