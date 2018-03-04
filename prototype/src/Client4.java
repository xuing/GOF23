/**
 * @author Lika
 * @date 2018/02/13 11:01
 * Description:测试效率差异
 * 如果短时间创建大量对象，并且new的过程比较耗时，则可以考虑使用原型模式！
 */
public class Client4 {

    public static void testNew(int size){
        long start = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            Laptop t = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("new的方式创建耗时:"+(end-start));
    }

    public static void testClone(int size) throws CloneNotSupportedException {
        Laptop t = new Laptop();
        long start = System.currentTimeMillis();

        for (int i=0;i<size;i++){
            Laptop temp = (Laptop) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("clone的方式创建耗时:"+(end-start));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        testNew(10000);
        testClone(10000);
    }
}

class Laptop implements Cloneable {
    public Laptop() {
//        try {
//            Thread.sleep(1); //模拟创建对象耗时的过程
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i=0;i<10;i++){
            System.out.print("");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}