package register;

public class login {
private String account;//账号
private String passNumber;//登入密码
private String joinIn;//进入
private String putOut;//退出

//无参构造器
    public login() {
    }
//有参构造器
    public login(String account, String passNumber, String joinIn, String putOut) {
        this.account = account;
        this.passNumber = passNumber;
        this.joinIn = joinIn;
        this.putOut = putOut;
    }
//封装
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    public String getJoinIn() {
        return joinIn;
    }

    public void setJoinIn(String joinIn) {
        this.joinIn = joinIn;
    }

    public String getPutOut() {
        return putOut;
    }

    public void setPutOut(String putOut) {
        this.putOut = putOut;
    }
}
