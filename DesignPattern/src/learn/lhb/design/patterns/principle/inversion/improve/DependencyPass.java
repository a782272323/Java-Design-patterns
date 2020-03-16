package learn.lhb.design.patterns.principle.inversion.improve;

/**
 * 依赖传递原则的三种实现方式
 * 1. 通过接口传递
 * 2. 通过构造方法传递
 * 3. 通过setter属性传递
 *
 * @author 梁鸿斌
 * @date 2020/3/16.
 * @time 21:48
 */
public class DependencyPass {
    public static void main(String[] args) {
        /**
         * 方法一的使用，接口Å
         */
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);

        /**
         * 方法二的使用,构造方法
         */
        XiMenZi xiMenZi = new XiMenZi();
        OpenAndClose2 openAndClose2 = new OpenAndClose2(xiMenZi);
        openAndClose2.open();

        /**
         * 方法3 的使用, setter
         */
        SanXing sanXing = new SanXing();
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(sanXing);
        openAndClose3.open();

    }
}

/**
 * 方式1： 通过接口传递实现依赖
 * 开关的接口
 */
interface IOpenAndClose {
    /**
     * 抽象方法，接收接口
     * @param tv
     */
    public void open(ITV tv);
}
/**
 * ITV接口
 */
interface ITV {
    public void play();
}
/**
 * 实现接口
 */
class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}
class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("打开长虹电视机");
    }
}



/**
 * 方式2 通过构造方法传递依赖
 */
interface IOpenAndClose2 {
    /**
     * 抽象方法
     */
    public void open();
}
interface ITV2 {
    /**
     * ITV2 接口
     */
    public void play();
}
class OpenAndClose2 implements IOpenAndClose2 {
    /**
     * 成员
     */
    public ITV2 itv2;

    @Override
    public void open() {
        this.itv2.play();
    }

    /**
     * 构造器
     * @param itv2
     */
    public OpenAndClose2(ITV2 itv2) {
        this.itv2 = itv2;
    }
}
class XiMenZi implements ITV2 {

    @Override
    public void play() {
        System.out.println("打开西门子电视机");
    }
}

/**
 * 方式3 ， 通过setter方法传递
 */
interface IOpenAndClose3 {
    /**
     * 抽象方法
     */
    public void open();

    public void setTv(ITV3 tv);
}
interface ITV3 {
    public void play();
}
class OpenAndClose3 implements IOpenAndClose3 {
    private ITV3 itv3;

    @Override
    public void open() {
        this.itv3.play();
    }

    @Override
    public void setTv(ITV3 tv) {
        this.itv3 = tv;
    }
}
class SanXing implements ITV3 {

    @Override
    public void play() {
        System.out.println("打开三星电视机");
    }
}
