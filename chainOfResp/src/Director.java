/**
 * @author Lika
 * @date 2018/03/03 16:06
 * Description:
 */
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<3){
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays());
            System.out.println("主任："+this.name+"审批通过");
        }else {
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
