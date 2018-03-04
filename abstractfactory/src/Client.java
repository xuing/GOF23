/**
 * @author Lika
 * @date 2018/02/12 17:09
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
    }
}
