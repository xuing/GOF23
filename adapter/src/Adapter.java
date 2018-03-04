/**
 * @author Lika
 * @date 2018/02/18 15:16
 * Description:适配器
 */
public class Adapter extends Adaptee implements Target{


    @Override
    public void handleReq() {
        super.request();
    }
}
