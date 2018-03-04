/**
 * @author Lika
 * @date 2018/03/04 14:02
 * Description:
 */
public class Context {
    private Strategy strategy; //当前采用的算法对象、

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(Strategy strategy) {

        this.strategy = strategy;
    }

    public  void printPrice(double s){
        System.out.println("该报价为："+strategy.getPrice(s));
    }
}
