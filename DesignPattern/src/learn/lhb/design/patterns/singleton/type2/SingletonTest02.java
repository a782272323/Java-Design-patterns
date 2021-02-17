package learn.lhb.design.patterns.singleton.type2;

/**
 * @Description  单例模式-饿汉式（静态代码块）
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/16
 * @time 22:11
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        // 测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 结果为 true(证明instance1和instance2相同)
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton {

    /**
     * 1. 构造器私有化，外部无法 new
     */
    private Singleton() {

    }

    /**
     * 2. 内部创建对象实例
     */
    private static Singleton instance;

    static {// 在静态代码块中，创建单例对象
        instance = new Singleton();
    }

    /**
     * 3. 对外提供一个公有的静态方法，返回实例对象
     */
    public static Singleton getInstance() {
        return instance;
    }
}