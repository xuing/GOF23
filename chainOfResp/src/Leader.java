/**
 * @author Lika
 * @date 2018/03/03 15:57
 * Description:抽象类
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader; //责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest request);
}
