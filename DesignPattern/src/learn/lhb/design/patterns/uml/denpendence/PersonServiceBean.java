package learn.lhb.design.patterns.uml.denpendence;

/**
 * @Description  UML类图 --- 依赖关系相关代码
 * @author Herbie Leung(梁鸿斌)
 * @date 2020/9/29
 * @time 20:44
 */
public class PersonServiceBean {
    private PersonDao personDao;

    public void save(Person person) {

    }

    public IDCard getIDCard(Integer personId) {
        return null;
    }

    public void modify() {
        Department department = new Department();
    }
}
