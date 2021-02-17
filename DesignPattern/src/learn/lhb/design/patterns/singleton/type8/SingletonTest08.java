package learn.lhb.design.patterns.singleton.type8;

/**
 * @Description  单例模式-枚举
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/17
 * @time 10:18
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        System.out.println("使用枚举完成单例模式。");
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
        instance1.sayOK();
        instance2.sayOK();
    }
}

enum Singleton {
    // 属性
    INSTANCE;

    public void sayOK() {
        System.out.println("ok~");
    }
}