/**
 * @author Lika
 * @date 2018/03/04 13:18
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development development = new Development(m);
        Finacial finacial = new Finacial(m);

        market.selfAction();
        market.outAction();

    }
}
