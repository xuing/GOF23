/**
 * @author Lika
 * @date 2018/03/03 13:44
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5,f6;
        Folder f1 = new Folder("我的收藏");
        f2 = new ImageFile("懵逼.jpg");
        f3 = new TextFile("情书.txt");
        f1.add(f2);
        f1.add(f3);
        f1.killVirus();
    }


}
