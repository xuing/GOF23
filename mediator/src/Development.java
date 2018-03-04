/**
 * @author Lika
 * @date 2018/03/04 13:10
 * Description:
 */
public class Development implements Department {
    private Mediator m; //持有中介者的引用

    public Development(Mediator m) {
        super();
        this.m = m;
        m.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("开发项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，需要资金");
    }
}
