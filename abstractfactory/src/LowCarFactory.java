/**
 * @author Lika
 * @date 2018/02/12 17:05
 * Description:
 */
public class LowCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() { return new LowSeat(); }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
