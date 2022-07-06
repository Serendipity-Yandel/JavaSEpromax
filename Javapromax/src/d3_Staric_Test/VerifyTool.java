package d3_Staric_Test;

import java.util.Random;

public class VerifyTool {
    /**
     * 私有构造器
     */
    private VerifyTool(){

    }

    /**
     * 静态方法
     */
    public  static String  createCode(int n){
        //开发验证码
        String chars="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
        //定义一个存储验证码的变量
        String  code="";
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            int index=r.nextInt(chars.length());
            code+=chars.charAt(index);
        }
        return code;
    }
}
