/**
 * @author Lika
 * @date 2018/03/03 16:34
 * Description:
 */
public interface MyIterator {
    void first();
    void next();
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    Object getCurrentObj();  //获取当前游标指向的对象
}
