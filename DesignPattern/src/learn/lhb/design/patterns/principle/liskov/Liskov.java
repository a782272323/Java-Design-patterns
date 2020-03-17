package learn.lhb.design.patterns.principle.liskov;

/**
 * 里氏替换原则 案例 1
 * 有缺陷，
 * 解决方案：
 * 1. 原来运行正常的相减功能发生了错误，原因是B类无意中重写类父类（A类）的方法，造成继承A类时，原有功能出错。
 * 在实际编程中，常常会通过重写父类的方法完成新的功能，这样写起来虽然简单，但整个继承体系但复用性比较差，耦合也
 * 随之增强，特别是运用多态比较频繁时
 * 2. 通用但做法是： 把原来但父类（A类）和子类（B类）都继承一个更通俗的基类，原有的继承关系去掉，采用依赖，聚
 * 合，组合等关系代替。
 *
 * @author 梁鸿斌
 * @date 2020/3/17.
 * @time 23:27
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.func1(11, 3));
        System.out.println("1 - 8 = "+ a.func1(1,8));
        System.out.println("----------------------------");
        B b = new B();
        System.out.println("11 - 3 = " + b.func1(11, 3));
        System.out.println("1 - 8 = " + b.func1(1, 8));
        System.out.println("11 + 3 + 9 = "+ b.func2(11,3));
    }
}

/**
 * A 类
 */
class A {
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
class B extends A {
    /**
     * 无意间重写了A类的func1（）方法,但调用时没发现重写了父类的方法，导致出错
     * @param a
     * @param b
     * @return
     */
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}