package tw.com.dh.dhdesignpattern.creational.PrototypePattern;

import java.util.Date;

public class Sheep implements Cloneable {
    private String mName;
    private Date mBirthday;

    public Sheep(String mName, Date mBirthday) {
        this.mName = mName;
        this.mBirthday = mBirthday;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Sheep s = (Sheep)obj;
        s.mBirthday = (Date)this.getBirthday().clone();
        return s;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public Date getBirthday() {
        return mBirthday;
    }

    public void setBirthday(Date mBirthday) {
        this.mBirthday = mBirthday;
    }

    @Override
    public String toString() {
        StringBuffer builder = new StringBuffer();
        builder.append("name: " + mName);
        builder.append(" date: " + mBirthday);
        return builder.toString();
    }
}
