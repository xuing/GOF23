import java.util.Date;

/**
 * @author Lika
 * @date 2018/02/13 9:52
 * Description: 深复制，s2的birthday是一个新对象
 */
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date d = new Date(12312312123L);
        Sheep2 s1 = new Sheep2("少利",d);
        Sheep2 s2 = (Sheep2) s1.clone();

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
