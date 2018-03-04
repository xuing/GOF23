/**
 * @author Lika
 * @date 2018/03/04 14:00
 * Description:
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("原价");
        return standardPrice;
    }
}
