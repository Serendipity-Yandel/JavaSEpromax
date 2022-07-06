package register_Teacher;

import java.util.Scanner;



/**
 * 退出系统
 * @author Administrator
 *
 */
public class ExitFun extends CommonFun {

    @Override
    public void execute() {
        System.out.println("欢迎进入"+this.getFunStr());
        System.out.println("是否退出系统？（Y/N）");
        Scanner scanner = Application.newInstance().getScanner();
        while(scanner.hasNextLine()){
            String str  = scanner.nextLine();
            if(str.equalsIgnoreCase("y")){
                Application app = Application.newInstance();
                app.logout();
                break;
            }
        }
        Application app = Application.newInstance();
        app.returnAndExecute();
    }

    @Override
    public int getCode() {
        return 4;
    }

    public String getFunStr(){
        return "退出功能，退出系统。";
    }
}
