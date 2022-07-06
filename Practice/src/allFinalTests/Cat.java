package allFinalTests;
//定义猫类继承父类
public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void shout() {
        System.out.print("喵喵喵~~~");
    }
    public void eat(Food food) {
        System.out.println(getName() + "正在吃"+food.getName());
    }
}
