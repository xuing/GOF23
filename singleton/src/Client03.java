import java.util.concurrent.CountDownLatch;

/**
 * @author Lika
 * @date 2018/02/05 11:30
 * Description:测试多线程环境下5种创建单例模式的效率
 */
public class Client03 {

    public static void main(String[] args) throws Exception {

        final int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        long start = System.currentTimeMillis();

        for (int i =0; i<threadNum ;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
                        Object o = SingletonDemo05.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

            countDownLatch.await();

            long end = System.currentTimeMillis();
            System.out.println("总耗时："+(end-start));

    }
}
