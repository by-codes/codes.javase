package club.banyuan.jdbc.pojo;

public class Major {

    private  int  majorid;
    private  String majorname;

    public Major() {
    }

    public Major(int majorid, String majorname) {
        this.majorid = majorid;
        this.majorname = majorname;
    }

    public int getMajorid() {
        return majorid;
    }

    public void setMajorid(int majorid) {
        this.majorid = majorid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorid=" + majorid +
                ", majorname='" + majorname + '\'' +
                '}';
    }
}
