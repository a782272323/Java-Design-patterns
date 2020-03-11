package learn.lhb.design.patterns.principle.singleresponsibility;

/**
 * 单一职责原则 01
 *
 * 方案1
 * 1. 在方式1 的run方法中违反了单一职责原则
 * 2. 解决方案，根据交通工具的不同，分解成不同的类
 * @author 梁鸿斌
 * @date 2020/3/11.
 * @time 22:57
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        // 飞机应该在天上飞的，但此时在路上跑，违反了单一职责原则
        vehicle.run("飞机");
    }

    /**
     * 交通工具类
     */
    static class Vehicle{
        public void run(String vehicle) {
            System.out.println(vehicle + " 在公路上运行......");
        }
    }
}
