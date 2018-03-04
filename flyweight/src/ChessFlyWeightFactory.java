import java.util.HashMap;
import java.util.Map;

/**
 * @author Lika
 * @date 2018/03/03 15:04
 * Description:享元工厂类
 */
public class ChessFlyWeightFactory {
    private static Map<String,ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color){
        if(map.get(color)!=null){
            return map.get(color);
        }else {
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }
}
