package register_Teacher;



/**
 * 标准化的功能接口
 * @author Administrator
 */
public interface Function {

    //功能的编号
    public int getCode();
    //功能的描述
    public String getFunStr();
    //执行
    public void execute();
    //打印菜单
    public String toString();
}
