package learn.lhb.design.patterns.factory.factorymethod.pizzastore.pizza;

/**
 * @Description  伦敦胡椒披萨类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 22:27
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println(" 给伦敦胡椒披萨准备原材料");
    }
}
