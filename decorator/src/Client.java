/**
 * @author Lika
 * @date 2018/03/03 14:18
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("增加新的功能，飞行---------");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新的功能，水里游---------");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加两个功能，水里游，飞行---------");
        WaterCar waterFlyCar = new WaterCar(flyCar);
        waterFlyCar.move();
    }
}
