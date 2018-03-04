/**
 * @author Lika
 * @date 2018/02/18 15:10
 * Description:客户端类（测试类）
 */
public class Client {

    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();
//        Target t = new Adapter();
//        c.test1(t);

        Target t = new Adapter2(a);
        c.test1(t) ;
    }
}
