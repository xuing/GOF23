import java.util.Date;

/**
 * @author Lika
 * @date 2018/02/13 9:37
 * Description:深复制
 */
public class Sheep2 implements Cloneable{
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone(); //直接调用object对象的clone()方法

        Sheep2 s = (Sheep2) obj;
        s.birthday = (Date) this.birthday.clone();

        return obj;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }
}
