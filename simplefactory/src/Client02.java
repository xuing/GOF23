/**
 * @author Lika
 * @date 2018/02/10 12:31
 * Description:简单工厂模式下
 */
public class Client02 {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");

        c1.run();
        c2.run();
    }
}
