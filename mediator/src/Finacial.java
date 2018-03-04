/**
 * @author Lika
 * @date 2018/03/04 13:12
 * Description:
 */
public class Finacial implements Department {
    private Mediator m; //持有中介者的引用

    public Finacial(Mediator m) {
        super();
        this.m = m;
        m.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，请求用途");
    }
}

