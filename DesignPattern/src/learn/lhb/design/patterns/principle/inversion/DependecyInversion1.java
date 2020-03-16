package learn.lhb.design.patterns.principle.inversion;

/**
 * 依赖倒转原则案例 1
 * 有缺陷，解决方案看下面
 *
 * @author 梁鸿斌
 * @date 2020/3/16.
 * @time 21:29
 */
public class DependecyInversion1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

/**
 * 电子邮件类
 */
class Email {
    public String getInfo() {
        return "电子邮件信息: 你好";
    }
}

/**
 * // 完成接受消息的功能
 * // 方式一完成
 * 1. 简单，比较容易想到
 * 2. 如果获取对象是微信，短信等等，则需要新增对应的类，同时Person类也要增加相应的接收方法
 * 3. 解决思路： 引入一个抽象的接口，IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
 *      因为Email WeChat 等等都是接收的范围，他们仅需要各自实现IReceiver 接口即可，这样就符合依赖倒转原则
 *
 */
class Person {

    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
