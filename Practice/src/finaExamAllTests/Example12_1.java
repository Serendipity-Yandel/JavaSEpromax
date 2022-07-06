package finaExamAllTests;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class Example12_1 {
    @SuppressWarnings("unchecked")
    public String toString(Object object) {
        // 获得代表该类的Class对象
        Class clazz = object.getClass();
        // 利用StringBuilder来保存字符串
        StringBuilder sb = new StringBuilder();
        // 获得类所在的包
        Package packageName = clazz.getPackage();
        // 输出类所在的包
        sb.append("包名：" + packageName.getName() + "\t");
        String className = clazz.getSimpleName(); // 获得类的简单名称
        sb.append("类名：" + className + "\n"); // 输出类的简单名称
        sb.append("公共构造方法：\n");
        // 获得所有代表构造方法的Constructor数组
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            String modifier =
                    Modifier.toString(constructor.getModifiers());// 获得方法修饰符
            if (modifier.contains("public")) {// 查看修饰符是否含“public”
                sb.append(constructor.toGenericString() + "\n");
            }
        }
        sb.append("公共域：\n");
        // 获得代表所有域的Field数组
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String modifier = Modifier.toString(field.getModifiers());
            if (modifier.contains("public")) {// 查看修饰符是否含“public”
                sb.append(field.toGenericString() + "\n");
            }
        }
        sb.append("公共方法：\n");
        // 获得代表所有方法的Method[]数组
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            String modifier = Modifier.toString(method.getModifiers());
            // 查看修饰符是否含有“public”
            if (modifier.contains("public")) {
                sb.append(method.toGenericString() + "\n");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
//        System.out.println(new StringUtils().toString(new Object()));
    }
}

