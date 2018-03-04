/**
 * @author Lika
 * @date 2018/02/10 12:29
 * Description:
 */
public class CarFactory {
    public static Car createCar(String type){
        if ("奥迪".equals(type)){
            return new Audi();
        }else if ("比亚迪".equals(type)){
            return new Byd();
        }else {
            return null;
        }
    }
}
