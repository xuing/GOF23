/**
 * @author Lika
 * @date 2018/03/03 13:14
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //销售联想的笔记本电脑
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();
    }
}
