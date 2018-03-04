/**
 * @author Lika
 * @date 2018/02/18 15:24
 * Description:对象适配器(使用组合)
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
