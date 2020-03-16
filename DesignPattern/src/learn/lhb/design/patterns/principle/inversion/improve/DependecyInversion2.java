package learn.lhb.design.patterns.principle.inversion.improve;

/**
 * 依赖倒转原则案例 2
 *
 * @author 梁鸿斌
 * @date 2020/3/16.
 * @time 21:37
 */
public class DependecyInversion2 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}


/**
 * 定义接口
 */
interface IReceiver {
    /**
     * 抽象方法
     * @return
     */
    public String getInfo();
}

/**
 * 电子邮件类
 */
class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息: 你好";
    }
}

/**
 * 增加微信
 */
class WeChat implements IReceiver {

    @Override
    public String getInfo() {
        return "微信信息: 你好";
    }
}

/**
 * // 完成接受消息的功能
 * // 方式2
 *
 */
class Person {

    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}
