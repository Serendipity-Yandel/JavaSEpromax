package register_Teacher;


public class Example01 {

    public static void main(String[] args) {
        /**
         * 1、数对象
         * 2、分类
         * 3、预判变化
         */

        /**
         * 面向对象的设计思路：
         * 前提条件：拿到一个需求分析
         * 转化成一个健壮的程序.
         *
         * 1、数对象(世界观)
         * 需求。（不完整的——>完整的世界）
         * 1-1可见的对象
         * 系统  Application（单例）
         * 功能 Function ->变化->标准化（接口）
         * 用户 User ->
         *
         * 1-2隐含的对象
         * 当前功能
         * 功能的生成器。
         * 权限
         *
         * 2、分类（设计类）
         * 类
         * 标准-->接口-->抽象类
         * 结构
         *
         * 3、预判
         * 变化\影响
         *
         */
        //创建一个系统
        Application app = Application.newInstance();
        app.addFunc(new LoginFun());
        app.addFunc(new RegistFun());
        app.addFunc(new ViewFun());
        app.addFunc(new ExitFun());

        //开始运行
        app.execute();
    }
}

