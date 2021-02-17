package learn.lhb.design.patterns.singleton.type7;

/**
 * @Description  单例模式-静态内部类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/17
 * @time 10:09
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式。");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton {

    /**
     * 构造器私有化
     */
    private Singleton() {

    }

    /**
     * 写一个静态内部类，该类中有一个静态属性 Singleton
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
     * @return
     */
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}