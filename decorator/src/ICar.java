/**
 * @author Lika
 * @date 2018/03/03 14:13
 * Description:
 */
public interface ICar {
    void move();
}
//具体构件对象
class Car implements ICar{

    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}

class SuperCar implements ICar{
    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水上游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}