import java.io.*;
import java.util.Date;

/**
 * @author Lika
 * @date 2018/02/13 10:45
 * Description:使用序列号反序列化实现深复制
 */
public class Client3 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date d = new Date(12312312123L);
        Sheep s1 = new Sheep("少利",d);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        //        Sheep s2 = (Sheep) s1.clone();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Sheep s2 = (Sheep) ois.readObject();


        d.setTime(923333334242L);
        System.out.println(s1.getBirthday());


        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }
}
