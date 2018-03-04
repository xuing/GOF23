/**
 * @author Lika
 * @date 2018/02/12 17:41
 * Description:
 */
public class ShipClient {
    public static void main(String[] args) {

        AirShipDirector director = new XpfAirShipDirector(new XpfAirShipBuilder());

        AirShip myShip = director.directAirShip();

        System.out.println(myShip.getEngine().getName());

        myShip.launch();

    }
}
