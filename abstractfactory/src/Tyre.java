/**
 * @author Lika
 * @date 2018/02/12 17:03
 * Description:
 */
public interface Tyre {
    void revoleve();
}

class LuxuryTyre implements Tyre{

    @Override
    public void revoleve() {
        System.out.println("不易磨损！");
    }
}
class LowTyre implements Tyre{

    @Override
    public void revoleve() {
        System.out.println("磨损快！");
    }
}