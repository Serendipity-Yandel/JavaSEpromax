package allFinalTests;
    //测试类
public class Test {
    public static void main(String[] args) {
        Feeder feeder = new Feeder("张三");
        feeder.speak();
        Dog dog = new Dog("小狗");
        dog.shout();
        Food food = new Bone();
        feeder.feed(dog, food);
        Cat cat = new Cat("小猫");
        cat.shout();
        food = new Fish("鲫鱼");
        feeder.feed(cat, food);
    }
}
