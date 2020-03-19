package learn.lhb.design.patterns.principle.ocp;

import java.awt.*;

/**
 * 开闭原则 案例 1 有缺陷
 * 原理： 对扩展开放（提供方），对修改关闭（使用方）
 * 缺陷：
 *  假如现在要新添加一个图形三角形种类，需要做如下修改，修改的地方比较多，
 *  而开闭原则是尽量不修改代码，或者尽可能少修改代码
 *
 * 改进思路：
 *  把创建Shape类 修改成抽象类，并提供一个抽象的draw方法，让子类去实现即可，
 *  这样，有新的图形种类时，只需要让新的图形类继承Shape，并实现draw方法即可。
 *  这样就满足了开闭原则。
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
        graphicEditor.drawTriangle(new Triangle());
    }

}

/**
 * 用于绘图的类(使用方)
 */
class GraphicEditor {
    /**
     * 接收 Shape对象，然后根据type来绘制不同的图形
     * @param shape
     */
    public void drawShape(Shape shape) {
        if (shape.m_type == 1) {
            drawRectangle(shape);
        } else if (shape.m_type == 2) {
            drawCircle(shape);
        } else if (shape.m_type == 3) {
            drawCircle(shape);
        }

    }

    public void drawRectangle(Shape r) {
        System.out.println(" 绘制矩形 ");
    }

    public void drawCircle(Shape r) {
        System.out.println(" 绘制圆形 ");
    }

    public void drawTriangle(Shape shape) {
        System.out.println(" 绘制三角形 ");
    }
}

/**
 * Shape类，基类
 */
class Shape {
    int m_type;
}

/**
 * 矩形类
 */
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

/**
 * 圆形类
 */
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

/**
 * 新增绘制三角形的类
 */
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}