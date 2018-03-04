/**
 * @author Lika
 * @date 2018/03/04 14:00
 * Description:
 */
public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice*0.9;
    }
}
