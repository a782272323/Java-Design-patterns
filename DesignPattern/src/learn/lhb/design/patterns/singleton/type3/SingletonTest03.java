package learn.lhb.design.patterns.singleton.type3;

/**
 * @Description  单例模式-懒汉式（线程不完全）
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/17
 * @time 09:20
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1，线程不安全");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才去创建 instance
     * 懒汉式
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
