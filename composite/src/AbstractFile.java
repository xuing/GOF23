import java.util.ArrayList;
import java.util.List;

/**
 * @author Lika
 * @date 2018/03/03 13:33
 * Description:
 */
public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile{
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---图像文件:"+name+"进行查杀");
    }
}

class TextFile implements AbstractFile{
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---文本文件:"+name+"进行查杀");
    }
}

class  Folder implements AbstractFile{
    private String name;
    //定义容器，用来存放本容器下构建的节点
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }



    @Override
    public void killVirus() {
        System.out.println("---文件夹："+name+"进行查杀");
        for (AbstractFile file : list){
            file.killVirus();
        }
    }

    public void add(AbstractFile c) {
        list.add(c);
    }

    public void remove(AbstractFile c) {
        list.remove(c);
    }

    public AbstractFile getChild(int index) {
        return  list.get(index);
    }

}