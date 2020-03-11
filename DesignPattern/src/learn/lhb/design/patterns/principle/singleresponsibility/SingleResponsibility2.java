package learn.lhb.design.patterns.principle.singleresponsibility;

/**
 * 单一职责原则
 * 解决 SingleResponsibility1 遗留的问题
 *
 * 方案2
 * 1. 遵守单一职责原则
 * 2. 但是这样做很麻烦，改动很大。所以要将类分解，同时修改客户端
 * 3. 改进： 直接修改Vehicle类
 *
 * @author 梁鸿斌
 * @date 2020/3/11.
 * @time 23:06
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("飞机");
    }

    /**
     * 公路交通工具
     */
    static class RoadVehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + " 在公路上运行");
        }
    }

    /**
     * 天上的交通工具
     */
    static class AirVehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + " 在天空上运行");
        }
    }

    /**
     * 水中的交通工具
     */
    static class WaterVehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + " 在水中上运行");
        }
    }

}
