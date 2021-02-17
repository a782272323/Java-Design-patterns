package learn.lhb.design.patterns.singleton.type4;

/**
 * @Description  单例模式-懒汉式（线程安全，同步方法）
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/17
 * @time 09:30
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2，线程安全，同步方法.");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton() {

    }

    /**
     * 提供一个静态的公有方法，加入了同步处理的代码，解决线程不安全的问题
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}