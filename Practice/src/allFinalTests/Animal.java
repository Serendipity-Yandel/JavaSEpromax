package allFinalTests;
    //父级动物类
public  abstract class Animal{
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    //重写父类中的抽象方法
    public abstract void shout();
    public abstract void eat(Food food);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
