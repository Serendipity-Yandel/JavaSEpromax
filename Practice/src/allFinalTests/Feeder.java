package allFinalTests;
    //饲养员
public class Feeder {
    private String name;
    public Feeder(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("欢迎来到动物园！");
        System.out.println("饲养员 "+getName());
    }
    public void feed(Animal a, Food food) {
        a.eat(food);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}