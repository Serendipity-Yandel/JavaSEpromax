package register_Teacher;


public class User {
    private String userName;
    private String password;

    // 封装
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPwd() {
        return false;
    }

    public boolean checkPwd(String pwd) {
        if (this.getPassword().equals(pwd)) {
            return true;
        }
        return false;
    }
}
