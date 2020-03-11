package learn.lhb.design.patterns.principle.singleresponsibility;

/**
 * 单一职责原则.
 * 最终版
 * 方案3的分析
 * 1. 这种修改方法没有对原来的类做大量修改，仅仅增加了方法
 * 2. 这里虽然没有在class类级别遵守单一职责原则，但方法级别上遵守了
 *
 * @author 梁鸿斌
 * @date 2020/3/11.
 * @time 23:17
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托车");
        vehicle2.run("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }


}

/**
 * 交通工具类
 */
class Vehicle2{
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行......");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行......");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中上运行......");
    }
}


