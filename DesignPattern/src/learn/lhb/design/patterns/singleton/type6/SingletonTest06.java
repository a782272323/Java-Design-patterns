package learn.lhb.design.patterns.singleton.type6;

/**
 * @Description  单例模式-双重检查
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/17
 * @time 09:58
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton() {}

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决了线程安全问题，同时解决懒加载问题
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new  Singleton();
                }
            }
        }
        return instance;
    }
}
