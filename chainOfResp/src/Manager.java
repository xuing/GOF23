/**
 * @author Lika
 * @date 2018/03/03 16:06
 * Description:
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<10){
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays());
            System.out.println("经理："+this.name+"审批通过");
        }else {
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
