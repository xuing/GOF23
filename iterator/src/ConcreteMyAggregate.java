import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lika
 * @date 2018/03/03 16:37
 * Description:
 */
public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<Object>();


    public void addObject(Object obj){
        this.list.add(obj);
    }
    public void removeObject(Object obj){
        this.list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyIterator createIterator(){
        return new ConcreteIterator();
    }


    private class ConcreteIterator implements MyIterator{

        private int cursor; //定义游标用于记录遍历时的位置

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if(cursor<list.size()){cursor++;}
        }

        @Override
        public boolean hasNext() {
            return cursor<list.size()?true:false;
    }

        @Override
        public boolean isFirst() {
            return cursor==0?true:false;
        }

        @Override
        public boolean isLast() {
            return cursor==(list.size()-1)?true:false;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }

}
