import java.util.Date;

/**
 * @author Lika
 * @date 2018/02/13 9:42
 * Description:测试原型模式(浅克隆)
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date d = new Date(12312312123L);
        Sheep s1 = new Sheep("少利",d);
        Sheep s2 = (Sheep) s1.clone();

        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
        d.setTime(923333334242L);
        System.out.println(s1.getBirthday());


        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());


    }

}
