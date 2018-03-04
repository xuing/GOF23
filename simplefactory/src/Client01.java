/**
 * @author Lika
 * @date 2018/02/10 12:26
 * Description:测试没有工厂模式的情况下
 */
public class Client01 {
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Byd();

        c1.run();
        c2.run();

    }
}
