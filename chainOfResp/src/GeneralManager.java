/**
 * @author Lika
 * @date 2018/03/03 16:06
 * Description:
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<30){
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays());
            System.out.println("总经理："+this.name+"审批通过");
        }else {
            System.out.println("莫非"+request.getEmpName()+"想辞职？请假"+request.getLeaveDays()+"天？");
        }
    }
}
