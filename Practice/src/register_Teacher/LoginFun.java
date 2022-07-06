package register_Teacher;


import java.util.Scanner;



/**
 * 登陆
 * @author Administrator
 *
 */
public class LoginFun extends CommonFun implements Function {

    @Override
    public void execute() {
        System.out.println("欢迎进入"+this.getFunStr());
        String userName = null;
        String pwd = null;
        System.out.println("请输入用户名：");
        Scanner scanner = Application.newInstance().getScanner();
        while(scanner.hasNextLine()){
            userName = scanner.nextLine();
            if(userName != null && !userName.equals("")){
                break;
            }
        }
        System.out.println("请输入用户密码：");
        while(scanner.hasNextLine()){
            pwd= scanner.nextLine();
            if(pwd != null && !pwd.equals("")){
                break;
            }
        }

        Application app = Application.newInstance();
        User user = app.searchUser(userName);
        if(user!=null){
            boolean isTrue = user.checkPwd(pwd);
            if(isTrue){
                System.out.println("登陆成功！！");
                app.login(user);
            }else{
                System.out.println("输入错误密码");
                app.logout();
            }
        }else{
            System.out.println("没有该用户.");
            app.logout();
        }
        app.returnAndExecute();
    }

    @Override
    public int getCode() {
        return 1;
    }

    @Override
    public String getFunStr() {
        return "登陆功能，用户输入正确的账号密码。";
    }
}
