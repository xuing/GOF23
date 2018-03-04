/**
 * @author Lika
 * @date 2018/02/12 17:04
 * Description:
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
