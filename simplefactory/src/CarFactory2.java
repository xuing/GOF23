/**
 * @author Lika
 * @date 2018/02/10 12:37
 * Description:
 */
public class CarFactory2 {
    public static Car createByd(){
        return new Byd();
    }
    public static Car createAudi(){
        return new Audi();
    }
}
