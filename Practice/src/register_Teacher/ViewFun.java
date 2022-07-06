package register_Teacher;


import java.util.List;


/**
 * 查看用户
 * @author Administrator
 *
 */
public class ViewFun extends CommonFun implements Function {

    @Override
    public void execute() {
        System.out.println("欢迎进入"+this.getFunStr());
        Application app = Application.newInstance();
        List<User> users = app.getUsers();
        System.out.println("用户名\t密码");
        for(User user:users){
            System.out.println(user.getUserName()+"\t"+user.getPassword());
        }
        app.returnAndExecute();
    }

    @Override
    public int getCode() {
        return 3;
    }

    @Override
    public String getFunStr() {
        return "查看功能，查看所有。";
    }

}
