package learn.lhb.design.patterns.factory.simplefactory.pizzastore.pizza;

/**
 * @Description  胡椒披萨
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 15:01
 */
public class PepperPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料");
    }
}
