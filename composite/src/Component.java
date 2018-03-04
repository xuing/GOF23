/**
 * @author Lika
 * @date 2018/03/03 13:29
 * Description:
 */
public interface Component {
    void operation();
}

interface Leaf extends Component{

}

interface Composite extends Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}