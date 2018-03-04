/**
 * @author Lika
 * @date 2018/02/12 17:34
 * Description:
 */
public class XpfAirShipBuilder implements AirShipBuilder{
    //TODO 可以与工厂模式结合
    @Override
    public Engine builderEngine() {
        System.out.println("构建鹏飞牌发动机!");
        return new Engine("鹏飞牌");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建鹏飞牌轨道舱！");
        return new OrbitalModule("鹏飞牌轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建鹏飞牌逃逸塔！");
        return new EscapeTower("鹏飞牌逃逸塔");
    }
}
