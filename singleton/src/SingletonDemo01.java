/**
 * @author Lika
 * @date 2018/02/04 10:41
 * Description:测试饿汉式单例模式
 * 线程安全（因为加载类的时候，天然线程安全），效率高
 */
public class SingletonDemo01 {
    private static SingletonDemo01 instance = new SingletonDemo01();  //类初始化时，立即加载对象(没有延时加载的优势)

    private SingletonDemo01(){
    }

    public static SingletonDemo01 getInstance(){
        return instance;
    }
}
