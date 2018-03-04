/**
 * @author Lika
 * @date 2018/03/04 14:00
 * Description:
 */
public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八折");
        return standardPrice*0.8;
    }
}
