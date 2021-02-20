package learn.lhb.design.patterns.factory.simplefactory.pizzastore.pizza;

/**
 * @Description  希腊披萨
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 14:47
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨准备原材料");
    }
}
