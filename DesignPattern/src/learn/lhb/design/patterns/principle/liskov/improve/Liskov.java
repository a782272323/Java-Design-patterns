package learn.lhb.design.patterns.principle.liskov.improve;

/**
 * 里氏替换原则 案例 2
 *
 * @author 梁鸿斌
 * @date 2020/3/17.
 * @time 23:27
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.func1(11, 3));
        System.out.println("1 - 8 = "+ a.func1(1, 8));
        System.out.println("----------------------------");
        B b = new B();
        // 因为B类不继承A类，因此func1不再是相减功能了
        // System.out.println("11 - 3 = " + b.func1(11, 3));
        System.out.println("11 + 3 = " + b.func1(11, 3));
        System.out.println("1 - 8 = " + b.func1(1, 8));
        System.out.println("11 + 3 + 9 = "+ b.func2(11,3));

        // 使用组合关系，来使用A类中的相减功能的方法
        System.out.println("11 - 3 = " + b.func3(11, 3));
    }
}

/**
 * 更加基础的基类
 */
class Base {
    /**
     * 把更加基础的方法和成员写到Bade类中
     *
     * @param num1
     * @param num2
     * @return
     */
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

/**
 * A 类基础 Base基类
 */
class A extends Base {
    /**
     * 返回两个数的差
     *
     * @param num1
     * @param num2
     * @return
     */

    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

/**
 * B 类继承 A 类
 * 增加了一个新的功能，完成两个数的相加，然后和9求和
 */
class B extends Base  {
    /**
     * 如果B需要使用A类的方法,使用组合的关系
     */
    private A a = new A();

    /**
     * 重写基类的方法，由于是基类，重写不会增加A和B的耦合
     * 也不好破坏A的相减功能。
     * @param a
     * @param b
     * @return
     */
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    /**
     * 使用A中的相减方法
     * @param a
     * @param b
     * @return
     */
    public int func3(int a,int b) {
        return this.a.func1(a, b);
    }
}