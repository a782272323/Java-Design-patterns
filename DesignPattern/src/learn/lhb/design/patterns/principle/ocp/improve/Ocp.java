package learn.lhb.design.patterns.principle.ocp.improve;

/**
 * 开闭原则 案例 2
 * 满足开闭原则，对扩展开放，对修改关闭
 *
 * @author 梁鸿斌
 * @date 2020/3/19.
 * @time 22:21
 */
public class Ocp {
    public static void main(String[] args) {
        // 使用，来看看存在什么问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }

}

/**
 *
 * 用于绘图的类(使用方)
 */
class GraphicEditor {
    /**
     * 接收 Shape对象，调用draw方法
     * @param shape
     */
    public void drawShape(Shape shape) {
        // 调用方法
        shape.draw();
    }

}

/**
 * 抽象类
 * Shape类，基类
 */
abstract class Shape {
    int m_type;
    // 抽象方法
    public abstract void draw();
}

/**
 * 矩形类
 */
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

/**
 * 圆形类
 */
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

/**
 * 新增绘制三角形的类
 */
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

/**
 * 新增一个图形
 */
class OtherGraphic extends Shape{

    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制其他图形 ");
    }
}