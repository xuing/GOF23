import org.jetbrains.annotations.Contract;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author Lika
 * @date 2018/02/04 10:46
 * Description:懒汉式单例模式(如何仿制反射和反序列化漏洞)
 * 延迟加载，懒加载。
 */
public class SingletonDemo06 implements Serializable {
    private static SingletonDemo06 s;

    private SingletonDemo06(){
        if(s != null){
            throw new RuntimeException();
        }
    } //私有化构造器

    public static synchronized SingletonDemo06 getInstance(){
        if (s == null) {
            s = new SingletonDemo06();
        }
        return s;
    }

    @Contract(pure = true)
    private Object readResolve() throws ObjectStreamException{
        return  s;
    }
}
