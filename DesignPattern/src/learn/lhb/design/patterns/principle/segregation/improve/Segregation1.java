package learn.lhb.design.patterns.principle.segregation.improve;

/**
 * 接口隔离原则案例 2
 * 案例 1的改进，实现接口隔离的最小接口数原则
 *
 * @author 梁鸿斌
 * @date 2020/3/14.
 * @time 22:43
 */
public class Segregation1 {

    public static void main(String[] args) {
        A a = new A();
        // A 类通过接口去依赖 B类
        a.depen1(new B());
        a.depen2(new B());
        a.depen3(new B());

        C c = new C();
        // C 类通过接口去依赖 D类
        c.depen1(new D());
        c.depen4(new D());
        c.depen5(new D());
    }
}

/**
 * 接口1
 */
interface Interface1{
    /**
     * 方法1
     */
    void operation1();

}

/**
 * 接口2
 */
interface Interface2{

    /**
     * 方法2
     */
    void operation2();

    /**
     * 方法3
     */
    void operation3();
}

/**
 * 接口3
 */
interface Interface3{

    /**
     * 方法4
     */
    void operation4();

    /**
     * 方法5
     */
    void operation5();
}

/**
 * B 类实现接口1，接口2里面的方法1，2，3
 */
class B implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}
/**
 * D 类实现接口1，接口3里面的方法1，4， 5
 */
class D implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

/**
 * A 类通过接口Interface 依赖使用 B类，但只会用到1，2，3方法
 */
class A {
    public void depen1(Interface1 i) {
        i.operation1();
    }
    public void depen2(Interface2 i) {
        i.operation2();
    }
    public void depen3(Interface2 i) {
        i.operation3();
    }
}

/**
 * C 类通过接口Interface 依赖使用 D类，但只会用到1，4, 5方法
 */
class C {
    public void depen1(Interface1 i) {
        i.operation1();
    }
    public void depen4(Interface3 i) {
        i.operation4();
    }
    public void depen5(Interface3 i) {
        i.operation5();
    }
}