/**
 * @author Lika
 * @date 2018/02/04 10:46
 * Description:懒汉式单例模式
 * 延迟加载，懒加载。
 */
public class SingletonDemo02 {
    private static SingletonDemo02 s;

    private SingletonDemo02(){} //私有化构造器

    public static synchronized SingletonDemo02 getInstance(){
        if (s != null) {
            s = new SingletonDemo02();
        }
        return s;
    }
}
