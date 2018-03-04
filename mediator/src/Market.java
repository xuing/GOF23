/**
 * @author Lika
 * @date 2018/03/04 13:12
 * Description:
 */
public class Market implements Department {
    private Mediator m; //持有中介者的引用

    public Market(Mediator m) {
        super();
        this.m = m;
        m.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("接项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，项目承接进度，需要资金支持");
        m.command("finacial");
    }
}

