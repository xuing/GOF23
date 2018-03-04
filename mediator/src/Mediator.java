/**
 * @author Lika
 * @date 2018/03/04 13:08
 * Description:
 */
public interface Mediator {
    void register(String dname,Department d);
    void command(String dname);
}
