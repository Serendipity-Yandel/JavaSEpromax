package d3_Staric_Test;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        String code=VerifyTool.createCode(5);
        System.out.println("验证码为"+code);
    }
}
