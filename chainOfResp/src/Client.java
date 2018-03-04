/**
 * @author Lika
 * @date 2018/03/03 16:11
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveRequest req1 = new LeaveRequest("xpf",5,"拯救世界");
                a.handleRequest(req1);
    }

}
