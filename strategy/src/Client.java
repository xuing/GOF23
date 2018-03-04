/**
 * @author Lika
 * @date 2018/03/04 14:06
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        Strategy s1 = new OldCustomerFewStrategy();
        Context ctx = new Context(s1);
        ctx.printPrice(1000);
    }
}
