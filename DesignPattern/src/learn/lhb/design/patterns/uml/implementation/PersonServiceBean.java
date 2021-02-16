package learn.lhb.design.patterns.uml.implementation;

/**
 * @Description
 * @author Herbie Leung(梁鸿斌)
 * @date 2020/9/29
 * @time 22:04
 */
public class PersonServiceBean implements PersonService {
    @Override
    public void delete(Integer id) {
        System.out.println("delete");
    }
}
