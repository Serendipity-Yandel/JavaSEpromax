package d9_extends_MethodOverride;

public class NewPhone extends Phone {
    /**
     *
     方法重写(重写方法的 名称 和 形参列表必须    与  被重写方法的名称 和形参列表一致）
     （私有方法不能重写）
     */
    @Override//防止重写错误，减少不必要的麻烦
    public  void call(){
        super.call();
        System.out.println("支持视频~~~");
    }
    /**
     *
     方法重写
     */
    @Override
    public void sentMessage(){
        super.sentMessage();
        System.out.println("支持发送图片和视频~~~");
    }
}
