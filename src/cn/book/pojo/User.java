package cn.book.pojo;

public class User {
    private String uid;
    private String name;
    private String sex;
    private String idcard;
    private String pwd;
    private String state;

    private int role;
    private int u_times ;

    public User(){

    }

    public User(String uid, String name, String sex, String idcard, String pwd, String state, int role, int u_times) {
        this.uid = uid;
        this.name = name;
        this.sex = sex;
        this.idcard = idcard;
        this.pwd = pwd;
        this.state = state;
        this.role = role;
        this.u_times = u_times;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getIdcard() {
        return idcard;
    }

    public String getPwd() {
        return pwd;
    }

    public String getState() {
        return state;
    }

    public int getRole() {
        return role;
    }

    public int getU_times() {
        return u_times;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setU_times(int u_times) {
        this.u_times = u_times;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", idcard='" + idcard + '\'' +
                ", pwd='" + pwd + '\'' +
                ", state='" + state + '\'' +
                ", role=" + role +
                ", u_times=" + u_times +
                '}';
    }
}