package register_Teacher;


import java.util.Scanner;


/**
 * 注册
 * @author Administrator
 *
 */
public class RegistFun extends CommonFun implements Function {

    @Override
    public void execute() {
        System.out.println("欢迎进入"+this.getFunStr());
        String userName = null;
        String pwd = null;
        String pwd2 = null;
        Application app = Application.newInstance();
        //输入用户名和密码进行注册
        System.out.println("请输入用户名：");
        Scanner scanner = Application.newInstance().getScanner();
        while(scanner.hasNextLine()){
            userName = scanner.nextLine();
            if(!this.isBlank(userName)){
                break;
            }
        }
        System.out.println("请输入用户密码：");
        while(scanner.hasNextLine()){
            pwd= scanner.nextLine();
            if(!this.isBlank(pwd)){
                break;
            }
        }
        System.out.println("请再次输入用户密码：");
        while(scanner.hasNextLine()){
            pwd2= scanner.nextLine();
            if(!this.isBlank(pwd)){
                break;
            }
        }

        //判断系统中是否有用户名
        User user = app.searchUser(userName);
        if(user!=null){
            System.out.println("已经存在本用户。"+userName);
            this.execute();
        }
        //两次输入的密码是否相同
        if(!pwd.equals(pwd2)){
            System.out.println("两次输入的密码不相同.");
            this.execute();
        }
        user = new User();
        user.setUserName(userName);
        //加密
        user.setPassword(pwd);
        app.addUser(user);
        System.out.println("用户注册成功："+userName);
        app.returnAndExecute();
    }

    @Override
    public int getCode() {
        return 2;
    }

    @Override
    public String getFunStr() {
        return "注册功能，输入用户名密码注册。";
    }

}

