/**
 * @author Lika
 * @date 2018/02/04 10:51
 * Description:双重检查锁实现单例模式
 */
public class SingletonDemo03 {
    private static SingletonDemo03 instance;
    public static SingletonDemo03 getInstance() {
        if (instance == null) {
            synchronized(SingletonDemo03.class) {
                if (instance == null) {
                    instance = new SingletonDemo03();
                }
            }
        }
        return instance;
    }
}
