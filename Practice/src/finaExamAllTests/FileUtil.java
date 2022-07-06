package finaExamAllTests;


import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 工具类
 */
public class FileUtil {
public static final String SEPARATE_FIELD = "\n";// 换行
public static final String SEPARATE_LINE = "\t"; // 分隔
/**
 * 保存日记信息
 */
public static void saveBooks(Diary diary) {
        // 判断本地是否存在此文件
        String name = "日记本.txt";
        InputStream in = null;
        try {
        in = new FileInputStream(name);// 判断本地是否存在此文件
        if (in != null) {
        in.close();// 关闭输入流
        // 可获取输入流，则存在文件，采取修改文件方式
        createFile(name, true, diary);
        }
        } catch (FileNotFoundException e) {
        // 输入流获取失败，则不存在文件，采取新建新文件方式
        createFile(name, false, diary);
        } catch (IOException e) {
        e.printStackTrace();
        }
        }
/**
 * 将日记信息保存到本地，可通过label标识来判断是修改文件还是新建文件
 * @param name  文件名
 * @param label 文件已存在的标识 true：已存在则修改； false：不存在则新建
 * @param diary 日记信息
 */
public static void createFile(String name, boolean label, Diary diary) {
        BufferedOutputStream out = null;
        StringBuffer sbf = new StringBuffer();// 拼接内容
        try {
        if (label) {// 当已存在当天的文件，则在文件内容后追加
        // 创建输出流，用于追加文件
        out = new BufferedOutputStream(new FileOutputStream(name, true));
        } else {// 不存在当天文件，则新建文件
        // 创建输出流，用于保存文件
        out = new BufferedOutputStream(new FileOutputStream(name));
        String fieldSort =  "欢迎来到日记本" ;// 创建表头
        // 新建时，将表头存入本地文件
        sbf.append(fieldSort).append(SEPARATE_FIELD);
        }
        sbf.append("时间：").append(diary.time);// 追加换行符号
        sbf.append("姓名：").append(diary.name).append(SEPARATE_LINE);
        sbf.append("标题：").append(diary.title).append(SEPARATE_LINE);
        sbf.append("天气：").append(diary.weather).append(SEPARATE_FIELD);
        sbf.append("内容：").append(diary.content).append(SEPARATE_FIELD);
        String str = sbf.toString();
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
        out.write(b[i]);// 将内容写入本地文件
        }
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
        try {
        if (out != null)
        out.close();// 关闭输出流
        } catch (Exception e2) {
        e2.printStackTrace();
        }
        }
        }
/*
 * 读取日记并显示
 */
public static void readFile() throws Exception{
        //创建文件字节输出流
        FileInputStream in = new FileInputStream("日记本.txt");
        byte[] b = new byte[in.available()];
        in.read(b);
        String str=new String(b);
        System.out.println(str);
        in.close();
        }
        }
