package learn.lhb.design.patterns.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则
 * 优化后的代码
 */
public class Demeter1 {

    public static void main(String[] args) {
        System.out.println("使用迪米特法则后的改进");
        // 创建 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
        // 输出学校总部员工id和学院员工id
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

/**
 * 学校总部员工类
 */
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 学院员工类
 */
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager {
    /**
     * 返回学院所有员工
     * @return
     */
    public List<CollegeEmployee> getAllEmploy() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id = " + i);
            list.add(emp);
        }


        return list;
    }

    // 输出学院员工的信息
    public void printEmployee() {
        // 获取学院员工
        List<CollegeEmployee> collegeEmployees = this.getAllEmploy();
        System.out.println("-----分公司员工-----");
        collegeEmployees.forEach(item -> {
            System.out.println(item.getId());
        });
    }
}

/**
 * 管理学校员工的管理类
 *
 * SchoolManager 的直接朋友类有哪些(称出现成员变量，方法参数，方法返回值中的类为直接的朋友)
 * Employee 类是直接朋友
 * CollegeManager 类是直接朋友
 *
 * CollegeEmployee 类不是SchoolManager 类的直接朋友而是一个陌生类,违法类迪米特法则
 */
class SchoolManager {
    /**
     * 返回学校总部所有员工
     * 以方法返回值作为SchoolManager的直接朋友
     * @return
     */
    public List<Employee> getAllEmploy() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id = " + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 输出学校总部和学院员工信息(id)
     * ColleageManager 以方法参数作为SchoolManager的直接朋友
     * @param sub
     */
    void printAllEmployee(CollegeManager sub) {

        /**
         * CollegeEmployee 属于局部变量,不是SchoolManager 类的直接朋友
         */

        /**
         * 分析问题
         * 1. 将输出学院的员工的方法封装到 CollegeManager 中
         */
        // 获取学校学院员工
        sub.printEmployee();

        // 获取学校总部员工
        List<Employee> employees = this.getAllEmploy();
        System.out.println("-----学校总部员工-----");
        employees.forEach(item -> {
            System.out.println(item.getId());
        });
    }
}