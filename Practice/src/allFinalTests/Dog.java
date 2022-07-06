package allFinalTests;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    //重写父类中的全部方法
    @Override
    public void shout() {
        System.out.print ("汪汪汪~~~");
    }
    @Override
    public void eat(Food food) {
        System.out.println(getName() + "正在啃" + food.getName());
    }
}