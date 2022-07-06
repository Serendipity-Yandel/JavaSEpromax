package d3_regex;
    /**
    目标：正则表达式在方法中的应用
    public String[] split(String regex)按照正则表达式匹配到的内容将字符串进行分割

    public String replaceAll(String regex,String newStr)按照正则表达式的内容进行替换
    */
public class RegexTest2 {
    public static void main(String[] args) {
            String name="sdfasafzz张三ddewfqw李四dfewqg王五";
            String[] arr=name.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String name2=name.replaceAll("\\w+"," ");
        System.out.println(name2);

    }
}
