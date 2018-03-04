/**
 * @author Lika
 * @date 2018/03/04 14:26
 * Description:
 */
public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("取号排队");
    }
    public abstract void  transact();

    public void evaluate(){
        System.out.println("反馈评分");
    }

    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
