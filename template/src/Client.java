/**
 * @author Lika
 * @date 2018/03/04 14:28
 * Description:
 */
public class Client {


    public static void main(String[] args) {

        BankTemplateMethod btm = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("理财2000万软妹币！");
            }
        };
        btm.process();
    }
}
