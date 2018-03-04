/**
 * @author Lika
 * @date 2018/03/03 14:57
 * Description:
 */
public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate coordinate);
}

class ConcreteChess implements ChessFlyWeight{
    public ConcreteChess(String color) {
        this.color = color;
    }

    private  String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+ coordinate.getX()+"-----"+coordinate.getY());
    }
}