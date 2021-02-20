package learn.lhb.design.patterns.factory.jdk.code;

import java.util.Calendar;

/**
 * @Description  工厂模式源码追踪类
 * @author Herbie Leung(梁鸿斌)
 * @date 2021/2/20
 * @time 14:33
 */
public class Factory {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("年： " + calendar.get(Calendar.YEAR));
        System.out.println("月： " + calendar.get(Calendar.MONTH) + 1);
        System.out.println("日： " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("时： " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分： " + calendar.get(Calendar.MINUTE));
        System.out.println("秒： " + calendar.get(Calendar.SECOND));
        System.out.println("年-月-日 时:分:秒 = " +
                calendar.get(Calendar.YEAR) + "-" +
                (calendar.get(Calendar.MONTH) + 1) + "-" +
                calendar.get(Calendar.DAY_OF_MONTH) + " " +
                calendar.get(Calendar.HOUR_OF_DAY) + ":" +
                calendar.get(Calendar.MINUTE) + ":" +
                calendar.get(Calendar.SECOND));
    }
}
