package learn.lhb.design.patterns.factory.absfactory.pizzastore.pizza;

/**
 * @Description  披萨抽象类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/18
 * @time 14:42
 */
public abstract class Pizza {
    /**
     * 披萨种类名字
     */
    protected String name;

    /**
     * 准备披萨原材料，不同披萨材料不一样。
     * 因此做成抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " 正在烘烤;");
    }

    public void cut() {
        System.out.println(name + "正在切割;");
    }

    public void box() {
        System.out.println(name + " 正在打包;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
