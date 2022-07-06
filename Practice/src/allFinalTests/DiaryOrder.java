package allFinalTests;

import finaExamAllTests.Diary;
import finaExamAllTests.FileUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class DiaryOrder {
    static ArrayList<Diary> diarysList=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("--------欢迎来到日记本--------");
        //创建flag，创建执行对象
        boolean falg = true;
        Scanner sc=new Scanner(System.in);
        while(falg) {
            System.out.println("1.编写日记");
            System.out.println("2.查看日记");
            int a = sc.nextInt();
            if(a==1) {
                //编写日记
                System.out.println("请输入姓名：");
                String name=sc.next();
                System.out.println("请输入天气：");
                String weather=sc.next();
                System.out.println("请输入标题：");
                String title=sc.next();
                System.out.println("请输入内容：");
                String content=sc.next();
                finaExamAllTests.Diary diary = addDiary(name,weather,title,content);
                finaExamAllTests.FileUtil.saveBooks(diary);
            }else if(a==2) {
                //查看日记
                FileUtil.readFile();
            }else {
                System.out.println("输入错误");
            }
        }
    }
    /*
     * 初始化日记列表
     */
    private static finaExamAllTests.Diary addDiary(String name, String weather, String
            title, String content) {
        //创建时间类，获取当前时间
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        String a=format.format(date).toString();
        //实例化日记对象
        finaExamAllTests.Diary diary=new Diary(a,name,weather,title,content);
        return diary;
    }
}
