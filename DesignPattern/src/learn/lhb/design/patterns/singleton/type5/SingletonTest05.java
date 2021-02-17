package learn.lhb.design.patterns.singleton.type5;

/**
 * @Description  单例模式-懒汉式（线程安全，同步代码块）
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/17
 * @time 09:39
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("懒汉式3，线程安全，同步代码块.");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton{

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
