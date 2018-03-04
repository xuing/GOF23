/**
 * @author Lika
 * @date 2018/03/04 14:00
 * Description:
 */
public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八五折");
        return standardPrice*0.85;
    }
}
