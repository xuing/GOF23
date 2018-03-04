/**
 * @author Lika
 * @date 2018/02/10 12:49
 * Description:
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
