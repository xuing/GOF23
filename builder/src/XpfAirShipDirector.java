/**
 * @author Lika
 * @date 2018/02/12 17:38
 * Description:
 */
public class XpfAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public XpfAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.builderEngine();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        EscapeTower escapeTower = builder.builderEscapeTower();

        //装配飞船对象
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);

        return airShip;
    }
}
