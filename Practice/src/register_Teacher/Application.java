package register_Teacher;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Application {

        private static Application app;
        //健壮性
        //所有功能
        private Function[] funs;

        //当前功能
        private Function currentFun;

        //用户列表
        private List<User> users = new ArrayList<User>();

        //当前用户
        private User currentUser;

        private Scanner scanner;

        //状态判读当前系统是否登陆
        //0:未登录；1：已经登陆
        private int status;

        //单例
        /**
         * 1、所有的类都可以访问，共享实例
         * @return
         */
        public static Application newInstance(){
            if(app==null){
                app = new Application();
            }
            return app;
        }

        private Application(){
            funs = new Function[4];
            scanner = new Scanner(System.in);
        }

        public Scanner getScanner(){
            return this.scanner;
        }
        public void returnAndExecute(){
            this.currentFun=null;
            this.execute();
        }
        public void execute(){
            Scanner scanner = this.getScanner();
            this.welcome();
            while(scanner.hasNextLine()){
                String line = scanner.next();
                if("exit".equals(line)){
                    break;
                }else{
                    this.run(line);
                }
            }
            this.returnAndExecute();
        }
        /**
         * 1、打开系统判读当前状态，如果登陆提示已经登陆则可以查看信息。
         * 2、没有登陆，进入登陆界面
         * 3、没有注册，进入注册界面
         */
        public void run(String cmd){
            if(this.currentFun==null){
                //接受数字code
                try{
                    Integer idx = Integer.parseInt(cmd);
                    for(Function fun:this.funs){
                        if(fun.getCode() == idx){
                            this.currentFun = fun;
                            this.run(cmd);
                            break;
                        }
                    }
                }catch(Exception e){
                }
            }else{
                this.currentFun.execute();
            }
        }
        /**
         * 添加功能
         */
        public void addFunc(Function fun){
            int idx=0;
            for(Function item:this.funs){
                if(item==null){
                    break;
                }
                idx++;
            }
            this.funs[idx] = fun;
        }

        public void addUser(User user){
            User searchUser = this.searchUser(user.getUserName());
            if(searchUser==null){
                this.users.add(user);
            }else{
                throw new RuntimeException("已经存在用户，不能添加。");
            }

        }


        /**
         * 根据用户名搜索用户
         * @param userName
         * @return
         */
        public User searchUser(String userName){
            for(User user :this.users){
                if(user.getUserName().equals(userName)){
                    return user;
                }
            }
            //没有用户异常
            return null;
        }

        public void setCurrentUser(User user){
            this.currentUser = user;
        }

        public List<User> getUsers(){
            return this.users;
        }
        public void login(User user){
            this.status=1;
            this.currentUser=user;
        }
        public void logout(){
            this.status=0;
            this.currentFun=null;
            this.currentUser=null;
        }

        public void welcome(){
            if(this.status==0){
                //打印菜单
                for(Function fun:this.funs){
                    System.out.println(fun);
                }
            }else if(this.status==1){
                System.out.println("当前用户是："+this.currentUser.getUserName());
                System.out.println("欢迎进入系统。（输入exit退出系统）");
            }
        }
}
