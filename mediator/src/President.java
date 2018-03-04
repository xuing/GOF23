import java.util.HashMap;

/**
 * @author Lika
 * @date 2018/03/04 13:15
 * Description:
 */
public class President implements Mediator {

    private HashMap<String,Department> map = new HashMap<String, Department>();

    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}
